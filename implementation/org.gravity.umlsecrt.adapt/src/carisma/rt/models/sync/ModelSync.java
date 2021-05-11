package carisma.rt.models.sync;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Comment;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DirectedRelationship;
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
	private final Model model;
	private Model unknown;
	private final HashMap<String, Classifier> classifiers;
	private final HashMap<RTNamedElement, NamedElement> rtToUmlMapping;

	public ModelSync(final Model model) {
		this.model = model;
		final EList<Element> allOwnedElements = model.allOwnedElements();
		final Collection<Object> allUmlClassifiers = EcoreUtil.getObjectsByType(allOwnedElements,
				UMLPackage.eINSTANCE.getClassifier());
		this.classifiers = new HashMap<>(allUmlClassifiers.size());
		for (final Object o : allUmlClassifiers) {
			final Classifier Classifier = (Classifier) o;
			final String signature = SignatureHelper.getQualifiedSignature(Classifier);
			this.classifiers.put(signature, Classifier);
		}
		this.rtToUmlMapping = new HashMap<>();
	}

	public Model sync(final RTProtocol protocol) {
		performRTTypeToClassifierMapping(protocol);
		performRTMemberToMemberMapping(protocol);

		final RTAccess access = protocol.getFirstAccess();
		Lifeline rightLifeline;
		final HashMap<Element, Lifeline> lifelines = new HashMap<>();

		final RTMember rtMember = access.getTarget();
		final RTType rtOwner = rtMember.getOwner();
		final NamedElement umlMember = this.rtToUmlMapping.get(rtMember);
		final Classifier umlInteractionOwner = (Classifier) umlMember.getOwner();

		final Interaction interaction = UMLFactory.eINSTANCE.createInteraction();
		interaction.setName("UMLsecRT Security Violation: " + protocol.getDate());
		this.unknown.getPackagedElements().add(interaction);

		rightLifeline = createLifeLine(interaction, umlInteractionOwner, lifelines);

		Message message = createMessage(umlMember, interaction, MessageSort.ASYNCH_CALL_LITERAL,
				access.getViolations());
		message.setReceiveEvent(createOccurrence(interaction, message, rightLifeline, "-receive"));

		RTAccess next = access.getNext();
		while (next != null) {
			final NamedElement umlTargetMember = this.rtToUmlMapping.get(next.getTarget());

			final Lifeline leftLifeline = rightLifeline;

			final Classifier umlOwner = (Classifier) umlTargetMember.getOwner();
			if (lifelines.containsKey(umlOwner)) {
				rightLifeline = lifelines.get(umlOwner);
			} else {
				rightLifeline = createLifeLine(interaction, umlOwner, lifelines);
			}

			addDependency(leftLifeline.getRepresents().getType(), rightLifeline.getRepresents().getType());

			final MessageSort sort = umlTargetMember.getName().equals((umlOwner).getName())
					? MessageSort.CREATE_MESSAGE_LITERAL
							: MessageSort.SYNCH_CALL_LITERAL;
			message = createMessage(umlTargetMember, interaction, sort, next.getViolations());

			message.setSendEvent(createOccurrence(interaction, message, leftLifeline, "-send"));
			message.setReceiveEvent(createOccurrence(interaction, message, rightLifeline, "-receive"));

			if (sort == MessageSort.SYNCH_CALL_LITERAL) {
				final Message reply = createMessage(null, interaction, MessageSort.REPLY_LITERAL, Collections.emptyList());
				reply.setSendEvent(createOccurrence(interaction, reply, rightLifeline, "-send"));
				reply.setReceiveEvent(createOccurrence(interaction, reply, leftLifeline, "-receive"));

				//				leftLifeline.getCoveredBys().remove(message.getSendEvent());
				//				rightLifeline.getCoveredBys().remove(reply.getReceiveEvent());

				final BehaviorExecutionSpecification behavior = UMLFactory.eINSTANCE.createBehaviorExecutionSpecification();
				behavior.setStart((OccurrenceSpecification) message.getReceiveEvent());
				behavior.setFinish((OccurrenceSpecification) reply.getSendEvent());
				behavior.getCovereds().add(rightLifeline);
				interaction.getFragments().add(behavior);
			}

			next = next.getNext();
		}

		return this.model;
	}

	private MessageOccurrenceSpecification createOccurrence(final Interaction interaction, final Message message,
			final Lifeline leftLifeline, final String postfix) {
		final MessageOccurrenceSpecification occurrence = UMLFactory.eINSTANCE.createMessageOccurrenceSpecification();
		occurrence.setEnclosingInteraction(interaction);
		occurrence.setCovered(leftLifeline);
		occurrence.setMessage(message);
		occurrence.setName(message.getName() + postfix);
		interaction.getFragments().add(occurrence);
		return occurrence;
	}

	private Message createMessage(final NamedElement member, final Interaction interaction, final MessageSort sort,
			final Collection<RTSecurity> violations) {
		final Message message = UMLFactory.eINSTANCE.createMessage();
		if (member != null) {
			message.setName(member.getName());
			message.setSignature(member);
		} else {
			message.setName("");
		}
		message.setMessageSort(sort);
		message.setInteraction(interaction);
		final int size = violations.size();
		if (size> 0) {
			final Object[] array = violations.toArray();
			final StringBuilder text = new StringBuilder("Violation of <<").append(array[0].toString().substring(2)).append(">>");
			if (size > 1) {
				if (size > 2) {
					for (int i = 1; i < (size - 1); i++) {
						text.append(", <<").append(array[i].toString().substring(2)).append(">>, <<");
					}
				}
				text.append(" and <<").append(array[size - 1].toString().substring(2)).append(">>");
			}
			addComment(message, text.toString());
		}
		return message;
	}

	private Lifeline createLifeLine(final Interaction interaction, final Classifier type, final HashMap<Element, Lifeline> lifelines) {
		final Lifeline lifeline = UMLFactory.eINSTANCE.createLifeline();
		lifeline.setName(type.getName());
		lifelines.put(type, lifeline);

		final Property property = UMLFactory.eINSTANCE.createProperty();
		property.setType(type);
		lifeline.setRepresents(property);

		interaction.getOwnedAttributes().add(property);
		interaction.getLifelines().add(lifeline);

		return lifeline;
	}

	private void performRTMemberToMemberMapping(final RTProtocol protocol) {
		for (final RTType type : protocol.getClasses()) {
			final HashMap<String, NamedElement> memberSignatures = new HashMap<>();

			final Class classifier = (Class) this.rtToUmlMapping.get(type);
			for (final Operation o : classifier.getOwnedOperations()) {
				memberSignatures.put(SignatureHelper.getSignature(o), o);
			}
			for (final Property p : classifier.getOwnedAttributes()) {
				memberSignatures.put(SignatureHelper.getSignature(p), p);
			}

			for (final RTMember member : type.getMembers()) {
				String name = member.getName();
				if (name.startsWith("<init>")) {
					name = classifier.getName() + "()";
					member.setName(name);
				}

				if (memberSignatures.containsKey(name)) {
					this.rtToUmlMapping.put(member, memberSignatures.get(name));
				} else {
					this.rtToUmlMapping.put(member, addMember(member, classifier));
				}
			}
		}
	}

	private void performRTTypeToClassifierMapping(final RTProtocol protocol) {
		for (final RTType type : protocol.getClasses()) {
			if (this.classifiers.containsKey(type.getName())) {
				final Classifier umlClassifier = this.classifiers.get(type.getName());
				this.rtToUmlMapping.put(type, umlClassifier);
			} else {
				this.rtToUmlMapping.put(type, addClassifier(type.getName()));
			}
		}
	}

	private Classifier addClassifier(final String siganture) {
		if (this.unknown == null) {
			this.unknown = UMLFactory.eINSTANCE.createModel();
			this.unknown.setName(UNKNOWN_CLASSIFIERS);
			this.model.getPackagedElements().add(this.unknown);
		}
		String[] names = siganture.split("\\.");
		int i = 0;
		Package currentPackage = this.unknown;
		for (; i < (names.length - 1); i++) {
			boolean createNewPackage = true;
			final String name = names[i];
			for (final PackageableElement p : this.unknown.getPackagedElements()) {
				if (p.eClass().equals(UMLPackage.eINSTANCE.getPackage()) && p.getName().equals(name)) {
					currentPackage = (Package) p;
					createNewPackage = false;
					break;
				}
			}
			if (createNewPackage) {
				final Package p = UMLFactory.eINSTANCE.createPackage();
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
			final String name = names[j];
			for (final Element n : currentClassifier.getOwnedElements()) {
				if ((n instanceof Classifier) && ((NamedElement) n).getName().equals(name)) {
					currentClassifier = (NamedElement) n;
					createNewClassifier = true;
					break;
				}
			}
			if (createNewClassifier) {
				final Classifier clazz = UMLFactory.eINSTANCE.createClass();
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
		this.classifiers.put(siganture, (Classifier) currentClassifier);
		return (Classifier) currentClassifier;
	}

	private NamedElement addMember(final RTMember member, final Class classifier) {
		if (member instanceof RTMethod) {
			return addOperation((RTMethod) member, classifier);
		} else {
			return addProperty((RTField) member, classifier);
		}

	}

	private NamedElement addProperty(final RTField member, final Class classifier) {
		final Property property = UMLFactory.eINSTANCE.createProperty();
		addComment(property, "Created by UMLsecRT");
		classifier.getOwnedAttributes().add(property);
		final String[] parts = member.getName().split(":");
		if (parts.length != 2) {
			throw new RuntimeException();
		}
		property.setName(parts[0]);
		Classifier type = this.classifiers.get(parts[1]);
		if (type == null) {
			type = addClassifier(parts[1]);
		}
		property.setType(classifier);
		return property;
	}

	private NamedElement addOperation(final RTMethod member, final Class classifier) {
		final Operation operation = UMLFactory.eINSTANCE.createOperation();
		addComment(operation, "Created by UMLsecRT");
		classifier.getOwnedOperations().add(operation);

		final String[] parts = member.getName().split("\\(| ?, ?|\\)|:");
		if (parts.length < 2) {
			if ((parts.length == 1) && parts[0].equals(classifier.getName())) {
				// It is a constructor
				operation.setName(parts[0]);
				return operation;
			}
			throw new RuntimeException();
		}

		final String name = parts[0];
		operation.setName(name);

		final String resturnTypeSignature = parts[parts.length - 1];
		Classifier returnType;
		if (this.classifiers.containsKey(resturnTypeSignature)) {
			returnType = this.classifiers.get(resturnTypeSignature);
		} else {
			returnType = addClassifier(resturnTypeSignature);
		}
		operation.setType(returnType);

		for (int i = 1; i < (parts.length - 1); i++) {
			final String[] param = parts[i].split(" ");
			if (param.length != 2) {
				throw new RuntimeException();
			}

		}

		return operation;
	}

	private void addDependency(final Type source, final Type target) {
		for (final DirectedRelationship rel : source.getSourceDirectedRelationships()) {
			if ((rel instanceof Dependency) && ((Dependency) rel).getSuppliers().contains(target)) {
				return;
			}
		}
		final Usage dependency = UMLFactory.eINSTANCE.createUsage();
		dependency.getSuppliers().add(target);
		dependency.getClients().add(source);
		dependency.setName(target.getName() + " (UMLsecRT Untracked Dependency)");
		source.getPackage().getPackagedElements().add(dependency);

		addComment(dependency, "Created by UMLsecRT");
	}

	private void addComment(final Element element, final String text) {
		final Comment comment = UMLFactory.eINSTANCE.createComment();
		comment.setBody(text);
		element.getOwnedComments().add(comment);
		comment.getAnnotatedElements().add(element);
	}
}
