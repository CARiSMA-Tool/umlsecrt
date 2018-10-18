package carisma.rt.models.sync;

import java.util.Collection;
import java.util.Collections;
import java.util.Hashtable;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.Usage;
import carisma.profile.umlsec.SignatureHelper;
import carisma.rt.models.protocol.RTAccess;
import carisma.rt.models.protocol.RTField;
import carisma.rt.models.protocol.RTMember;
import carisma.rt.models.protocol.RTMethod;
import carisma.rt.models.protocol.RTNamedElement;
import carisma.rt.models.protocol.RTProtocol;
import carisma.rt.models.protocol.RTSecurity;
import carisma.rt.models.protocol.RTType;

public class ModelSync {

	public static final String UNKNOWN_CLASSIFIERS = "UMLsecRT Unknown Classifiers";
	private Model model, unknown;
	private Hashtable<String, Classifier> classifiers;
	private Hashtable<RTNamedElement, NamedElement> rtToUmlMapping;

	public ModelSync(Model model) {
		this.model = model;
		EList<Element> allOwnedElements = model.allOwnedElements();
		Collection<Object> allUmlClassifiers = EcoreUtil.getObjectsByType(allOwnedElements,
				UMLPackage.eINSTANCE.getClassifier());
		this.classifiers = new Hashtable<String, Classifier>(allUmlClassifiers.size());
		for (Object o : allUmlClassifiers) {
			Classifier Classifier = (Classifier) o;
			String signature = SignatureHelper.getQualifiedSignature(Classifier);
			classifiers.put(signature, Classifier);
		}
		rtToUmlMapping = new Hashtable<RTNamedElement, NamedElement>();
	}

	public Model sync(RTProtocol protocol) {
		performRTTypeToClassifierMapping(protocol);
		performRTMemberToMemberMapping(protocol);

		RTAccess access = protocol.getFirstAccess();
		Lifeline rightLifeline;
		Hashtable<Element, Lifeline> lifelines = new Hashtable<>();

		RTMember rtMember = access.getTarget();
		RTType rtOwner = rtMember.getOwner();
		NamedElement umlMember = rtToUmlMapping.get(rtMember);
		Classifier umlInteractionOwner = (Classifier) umlMember.getOwner();

		Interaction interaction = UMLFactory.eINSTANCE.createInteraction();
		interaction.setName("UMLsecRT Security Violation: " + protocol.getDate());
		unknown.getPackagedElements().add(interaction);

		rightLifeline = createLifeLine(interaction, umlInteractionOwner, lifelines);

		Message message = createMessage(umlMember, interaction, MessageSort.ASYNCH_CALL_LITERAL,
				access.getViolations());
		message.setReceiveEvent(createOccurrence(interaction, message, rightLifeline, "-receive"));

		RTAccess next = access.getNext();
		while (next != null) {
			NamedElement umlTargetMember = rtToUmlMapping.get(next.getTarget());

			Lifeline leftLifeline = rightLifeline;

			Classifier umlOwner = (Classifier) umlTargetMember.getOwner();
			if (lifelines.containsKey(umlOwner)) {
				rightLifeline = lifelines.get(umlOwner);
			} else {
				rightLifeline = createLifeLine(interaction, umlOwner, lifelines);
			}

			addDependency(leftLifeline.getRepresents().getType(), rightLifeline.getRepresents().getType());

			MessageSort sort = umlTargetMember.getName().equals((umlOwner).getName())
					? MessageSort.CREATE_MESSAGE_LITERAL
					: MessageSort.SYNCH_CALL_LITERAL;
			message = createMessage(umlTargetMember, interaction, sort, next.getViolations());

			message.setSendEvent(createOccurrence(interaction, message, leftLifeline, "-send"));
			message.setReceiveEvent(createOccurrence(interaction, message, rightLifeline, "-receive"));

			if (sort == MessageSort.SYNCH_CALL_LITERAL) {
				Message reply = createMessage(null, interaction, MessageSort.REPLY_LITERAL, Collections.emptyList());
				reply.setSendEvent(createOccurrence(interaction, reply, rightLifeline, "-send"));
				reply.setReceiveEvent(createOccurrence(interaction, reply, leftLifeline, "-receive"));

//				leftLifeline.getCoveredBys().remove(message.getSendEvent());
//				rightLifeline.getCoveredBys().remove(reply.getReceiveEvent());

				BehaviorExecutionSpecification behavior = UMLFactory.eINSTANCE.createBehaviorExecutionSpecification();
				behavior.setStart((OccurrenceSpecification) message.getReceiveEvent());
				behavior.setFinish((OccurrenceSpecification) reply.getSendEvent());
				behavior.getCovereds().add(rightLifeline);
				interaction.getFragments().add(behavior);
			}

			next = next.getNext();
		}

		return model;
	}

	private MessageOccurrenceSpecification createOccurrence(Interaction interaction, Message message,
			Lifeline leftLifeline, String postfix) {
		MessageOccurrenceSpecification occurrence = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		occurrence.setEnclosingInteraction(interaction);
		occurrence.setCovered(leftLifeline);
		occurrence.setMessage(message);
		occurrence.setName(message.getName() + postfix);
		interaction.getFragments().add(occurrence);
		return occurrence;
	}

	private Message createMessage(NamedElement member, Interaction interaction, MessageSort sort,
			Collection<RTSecurity> violations) {
		Message message = UMLFactory.eINSTANCE.createMessage();
		if (member != null) {
			message.setName(member.getName());
			message.setSignature(member);
		} else {
			message.setName("");
		}
		message.setMessageSort(sort);
		message.setInteraction(interaction);
		if (violations.size() > 0) {
			Object[] array = violations.toArray();
			String text = "Violation of <<" + array[0].toString().substring(2) + ">>";
			if (violations.size() > 1) {
				if (violations.size() > 2) {
					for (int i = 1; i < violations.size() - 1; i++) {
						text += ", <<" + array[i].toString().substring(2) + ">>, <<";
					}
				}
				text += " and <<" + array[violations.size() - 1].toString().substring(2) + ">>";
			}
			addComment(message, text);
		}
		return message;
	}

	private Lifeline createLifeLine(Interaction interaction, Classifier type, Hashtable<Element, Lifeline> lifelines) {
		Lifeline lifeline = UMLFactory.eINSTANCE.createLifeline();
		lifeline.setName(type.getName());
		lifelines.put(type, lifeline);

		Property property = UMLFactory.eINSTANCE.createProperty();
		property.setType(type);
		lifeline.setRepresents(property);

		interaction.getOwnedAttributes().add(property);
		interaction.getLifelines().add(lifeline);

		return lifeline;
	}

	private void performRTMemberToMemberMapping(RTProtocol protocol) {
		for (RTType type : protocol.getClasses()) {
			Hashtable<String, NamedElement> memberSignatures = new Hashtable<String, NamedElement>();

			Class classifier = (Class) rtToUmlMapping.get(type);
			for (Operation o : classifier.getOwnedOperations()) {
				memberSignatures.put(SignatureHelper.getSignature(o), o);
			}
			for (Property p : classifier.getOwnedAttributes()) {
				memberSignatures.put(SignatureHelper.getSignature(p), p);
			}

			for (RTMember member : type.getMembers()) {
				String name = member.getName();
				if (name.startsWith("<init>")) {
					name = classifier.getName() + "()";
					member.setName(name);
				}

				if (memberSignatures.containsKey(name)) {
					rtToUmlMapping.put(member, memberSignatures.get(name));
				} else {
					rtToUmlMapping.put(member, addMember(member, classifier));
				}
			}
		}
	}

	private void performRTTypeToClassifierMapping(RTProtocol protocol) {
		for (RTType type : protocol.getClasses()) {
			if (classifiers.containsKey(type.getName())) {
				Classifier umlClassifier = classifiers.get(type.getName());
				rtToUmlMapping.put(type, umlClassifier);
			} else {
				rtToUmlMapping.put(type, addClassifier(type.getName()));
			}
		}
	}

	private Classifier addClassifier(String siganture) {
		if (unknown == null) {
			unknown = UMLFactory.eINSTANCE.createModel();
			unknown.setName(UNKNOWN_CLASSIFIERS);
			model.getPackagedElements().add(unknown);
		}
		String[] names = siganture.split("\\.");
		int i = 0;
		Package currentPackage = unknown;
		for (; i < names.length - 1; i++) {
			boolean createNewPackage = true;
			String name = names[i];
			for (PackageableElement p : unknown.getPackagedElements()) {
				if (p.eClass().equals(UMLPackage.eINSTANCE.getPackage()) && p.getName().equals(name)) {
					currentPackage = (Package) p;
					createNewPackage = false;
					break;
				}
			}
			if (createNewPackage) {
				Package p = UMLFactory.eINSTANCE.createPackage();
				addComment(p, "Created by UMLsecRT");
				p.setName(name);
				currentPackage.getPackagedElements().add(p);
				currentPackage = p;
			}
		}
		names = names[i].split("$");

		int j = 0;
		NamedElement currentClassifier = currentPackage;
		for (; j < names.length; j++) {
			boolean createNewClassifier = true;
			String name = names[j];
			for (Element n : currentClassifier.getOwnedElements()) {
				if ((n instanceof Classifier) && ((NamedElement) n).getName().equals(name)) {
					currentClassifier = (NamedElement) n;
					createNewClassifier = true;
					break;
				}
			}
			if (createNewClassifier) {
				Classifier clazz = UMLFactory.eINSTANCE.createClass();
				addComment(clazz, "Created by UMLsecRT");
				clazz.setName(name);
				if (currentClassifier instanceof Package) {
					((Package) currentClassifier).getPackagedElements().add(clazz);
				} else if (currentClassifier instanceof Class) {
					((Class) currentClassifier).getNestedClassifiers().add(clazz);
				} else if (currentClassifier instanceof Interface) {
					((Interface) currentClassifier).getNestedClassifiers().add(clazz);
				} else {
					throw new RuntimeException();
				}
				currentClassifier = clazz;
			}
		}
		classifiers.put(siganture, (Classifier) currentClassifier);
		return (Classifier) currentClassifier;
	}

	private NamedElement addMember(RTMember member, Class classifier) {
		if (member instanceof RTMethod) {
			return addOperation((RTMethod) member, classifier);
		} else {
			return addProperty((RTField) member, classifier);
		}

	}

	private NamedElement addProperty(RTField member, Class classifier) {
		Property property = UMLFactory.eINSTANCE.createProperty();
		addComment(property, "Created by UMLsecRT");
		classifier.getOwnedAttributes().add(property);
		String[] parts = member.getName().split(":");
		if (parts.length != 2) {
			throw new RuntimeException();
		}
		property.setName(parts[0]);
		Classifier type = classifiers.get(parts[1]);
		if (type == null) {
			type = addClassifier(parts[1]);
		}
		property.setType(classifier);
		return property;
	}

	private NamedElement addOperation(RTMethod member, Class classifier) {
		Operation operation = UMLFactory.eINSTANCE.createOperation();
		addComment(operation, "Created by UMLsecRT");
		classifier.getOwnedOperations().add(operation);

		String[] parts = member.getName().split("\\(| ?, ?|\\)|:");
		if (parts.length < 2) {
			if (parts.length == 1 && parts[0].equals(classifier.getName())) {
				// It is a constructor
				operation.setName(parts[0]);
				return operation;
			}
			throw new RuntimeException();
		}

		String name = parts[0];
		operation.setName(name);

		String resturnTypeSignature = parts[parts.length - 1];
		Classifier returnType;
		if (classifiers.containsKey(resturnTypeSignature)) {
			returnType = classifiers.get(resturnTypeSignature);
		} else {
			returnType = addClassifier(resturnTypeSignature);
		}
		operation.setType(returnType);

		for (int i = 1; i < parts.length - 1; i++) {
			String[] param = parts[i].split(" ");
			if (param.length != 2) {
				throw new RuntimeException();
			}

		}

		return operation;
	}

	private void addDependency(Type source, Type target) {
		for (DirectedRelationship rel : source.getSourceDirectedRelationships()) {
			if (rel instanceof Dependency) {
				if (((Dependency) rel).getSuppliers().contains(target)) {
					return;
				}
			}
		}
		Usage dependency = UMLFactory.eINSTANCE.createUsage();
		dependency.getSuppliers().add(target);
		dependency.getClients().add(source);
		dependency.setName(target.getName() + " (UMLsecRT Untracked Dependency)");
		source.getPackage().getPackagedElements().add(dependency);

		addComment(dependency, "Created by UMLsecRT");
	}

	private void addComment(Element element, String text) {
		Comment comment = UMLFactory.eINSTANCE.createComment();
		comment.setBody(text);
		element.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(element);
	}
}
