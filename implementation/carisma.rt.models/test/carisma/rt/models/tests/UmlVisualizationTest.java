package carisma.rt.models.tests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.eclipse.core.internal.runtime.DevClassPathHelper;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.Anchor;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.Bendpoints;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.DiagramStyle;
import org.eclipse.gmf.runtime.notation.IdentityAnchor;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Location;
import org.eclipse.gmf.runtime.notation.MeasurementUnit;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.NotationFactory;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.RelativeBendpoints;
import org.eclipse.gmf.runtime.notation.Shape;
import org.eclipse.gmf.runtime.notation.StringValueStyle;
import org.eclipse.gmf.runtime.notation.Style;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.infra.gmfdiag.style.StyleFactory;
import org.eclipse.papyrus.infra.gmfdiag.style.StylePackage;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.ConnectorKind;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.OccurrenceSpecification;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.internal.impl.MessageOccurrenceSpecificationImpl;
import org.eclipse.uml2.uml.resource.UMLResource;

import carisma.rt.models.sync.ModelSync;

public class UmlVisualizationTest {
	
	private static Hashtable<Lifeline, Shape> lifelines = new Hashtable<>();
	private static Hashtable<Message, Integer> messagePositions = new Hashtable<>();

	public static void main(String[] args) {
		ResourceSet set = new ResourceSetImpl();
		Registry packages = set.getPackageRegistry();
		packages.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		packages.put(NotationPackage.eNS_URI, NotationPackage.eINSTANCE);
		packages.put(StylePackage.eNS_URI, StylePackage.eINSTANCE);
		Map<String, Object> factories = set.getResourceFactoryRegistry().getExtensionToFactoryMap();
		factories.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		factories.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		String umlPath = new File("protocols/Classloader-changed.uml").getAbsolutePath();

		Resource umlResource = set.getResource(URI.createFileURI(umlPath), true);
		try {
			umlResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			return;
		}
		Model model = (Model) umlResource.getContents().get(0);
		Interaction interaction = (Interaction) EcoreUtil.getObjectByType(
				((Model) model.getPackagedElement(ModelSync.UNKNOWN_CLASSIFIERS)).getPackagedElements(),
				UMLPackage.eINSTANCE.getInteraction());

		drawSequenceDiagram(interaction);

	}

	private static void drawSequenceDiagram(Interaction interaction) {
		Resource umlResource = interaction.eResource();
		ResourceSet set = umlResource.getResourceSet();

		String umlURI = umlResource.getURI().toFileString();

		String notationPath = umlURI.substring(0, umlURI.length() - 3) + "notation";
		String diPath = umlURI.substring(0, umlURI.length() - 3) + "di";

		Resource notationResource;
		Resource diResource;
		try {
			URI notationURI = URI.createFileURI(notationPath);
			if (new File(notationPath).exists()) {
				notationResource = set.getResource(notationURI, true);
				notationResource.load(Collections.EMPTY_MAP);
			} else {
				notationResource = set.createResource(notationURI);
			}

			URI diURI = URI.createFileURI(diPath);
			if (new File(diPath).exists()) {
				diResource = set.getResource(diURI, true);
				diResource.load(Collections.EMPTY_MAP);
			} else {
				diResource = set.createResource(diURI);
			}
		} catch (IOException e) {
			return;
		}
		
		Shape interactionShape = drawInteraction(interaction, notationResource);
		
		int x = 50, y = 10;
		int height = 10 + interaction.getMessages().size()*100;
		for(Lifeline lifeline : interaction.getLifelines()) {
			drawLifeline(interactionShape, x, y, height, lifeline);
			x += 200;
		}
	
		int counter = 0;
		for(Message message : interaction.getMessages()) {

			int absolutePos = 70+100*counter;
			
			messagePositions.put(message, absolutePos);
			
			drawMessage(interactionShape, absolutePos, message);
			
			counter++;
		}
		
		for(InteractionFragment fragment : interaction.getFragments()) {
			if (fragment instanceof BehaviorExecutionSpecification) {
				BehaviorExecutionSpecification behavior = (BehaviorExecutionSpecification) fragment;
				Shape lifelineShape = lifelines.get(behavior.getCovereds().get(0));
				
				Shape behaviorShape = (Shape) lifelineShape.createChild(NotationPackage.eINSTANCE.getShape());
				behaviorShape.setType("BehaviorExecutionSpecification_Shape");
				behaviorShape.setElement(behavior);
				
				Bounds behaviorLocation = (Bounds) behaviorShape.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());
				behaviorLocation.setX(40);
				behaviorLocation.setWidth(20);
				
				int s = messagePositions.get(((MessageOccurrenceSpecification) behavior.getStart()).getMessage());
				int h = messagePositions.get(((MessageOccurrenceSpecification) behavior.getFinish()).getMessage()) - s;
				
				behaviorLocation.setY(s-5);
				behaviorLocation.setHeight(h);
				
				DecorationNode decorationNode = (DecorationNode) behaviorShape.createChild(NotationPackage.eINSTANCE.getDecorationNode());
				decorationNode.setType("BehaviorExecutionSpecification_Behavior");

				Location location = (Location) decorationNode.createLayoutConstraint(NotationPackage.eINSTANCE.getLocation());
				location.setX(18);
				location.setY(18);
			}
		}
				
		try {
			notationResource.save(Collections.EMPTY_MAP);
			diResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {

		}
	}

	private static void drawMessage(Shape interactionShape, int pos, Message message) {
		String edgeKind = null, labelKind = null, stereotypeKind = null;
		
		switch(message.getMessageKind()) {
		case COMPLETE_LITERAL:
			break;
		case FOUND_LITERAL:
			edgeKind  = "Message_FoundEdge";
			labelKind = "Message_FoundNameLabel";
			stereotypeKind = "Message_FoundStereotypeLabel";
			break;
		case LOST_LITERAL:
			edgeKind  = "Message_LostEdge";
			labelKind = "Message_LostNameLabel";
			stereotypeKind = "Message_LostStereotypeLabel";
			break;
		case UNKNOWN_LITERAL:
			break;
		default:
			break;
		}
		
		if(edgeKind== null)
		switch(message.getMessageSort()) {
		case ASYNCH_CALL_LITERAL:
			break;
		case ASYNCH_SIGNAL_LITERAL:
			break;
		case CREATE_MESSAGE_LITERAL:
			edgeKind  = "Message_CreateEdge";
			labelKind = "Message_CreateNameLabel";
			stereotypeKind = "Message_CreateStereotypeLabel";
			break;
		case DELETE_MESSAGE_LITERAL:
			break;
		case REPLY_LITERAL:
			edgeKind  = "Message_ReplyEdge";
			labelKind = "Message_ReplyNameLabel";
			stereotypeKind = "Message_ReplyStereotypeLabel";
			break;
		case SYNCH_CALL_LITERAL:
			edgeKind  = "Message_SynchEdge";
			labelKind = "Message_SynchNameLabel";
			stereotypeKind = "Message_SynchStereotypeLabel";
			break;
		}

		Diagram diagram = (Diagram) interactionShape.eContainer();
		
		Connector connector = (Connector) diagram.createEdge(NotationPackage.eINSTANCE.getConnector());
		connector.setType(edgeKind);
		
		MessageEnd receive = message.getReceiveEvent();
		if (receive instanceof MessageOccurrenceSpecification) {
			Shape rightLifelineShape = lifelines.get(((MessageOccurrenceSpecification) receive).getCovered());
			connector.setTarget(rightLifelineShape);
			if(message.getMessageSort() == MessageSort.CREATE_MESSAGE_LITERAL) {
				LayoutConstraint constraint = rightLifelineShape.getLayoutConstraint();
				if (constraint instanceof Bounds) {
					Bounds bounds = (Bounds) constraint;
					bounds.setY(messagePositions.get(message));
					int oldHeight = bounds.getHeight();
					int newHeight = oldHeight-bounds.getY();
					bounds.setHeight(newHeight);
				}
			}
		}
		else if(message.getMessageKind() == MessageKind.LOST_LITERAL){
			connector.setTarget(interactionShape);
		}
		else {
			throw new RuntimeException();
		}
		
		MessageEnd send = message.getSendEvent();
		if (send instanceof MessageOccurrenceSpecification) {
			Shape leftLifelineShape = lifelines.get(((MessageOccurrenceSpecification) send).getCovered());
			connector.setSource(leftLifelineShape);
		}
		else if(message.getMessageKind() == MessageKind.FOUND_LITERAL){
			connector.setSource(interactionShape);
		}
		else {
			throw new RuntimeException();
		}
		
		Node nameLabelDecorationNode = connector.createChild(NotationPackage.eINSTANCE.getDecorationNode());
		nameLabelDecorationNode.setType(labelKind);
		Location nameLabelLocation = (Location) nameLabelDecorationNode.createLayoutConstraint(NotationPackage.eINSTANCE.getLocation());
		nameLabelLocation.setX(1);
		nameLabelLocation.setY(-13);
		

		Node decorationNode = connector.createChild(NotationPackage.eINSTANCE.getDecorationNode());
		decorationNode.setType(stereotypeKind);
		Location location = (Location) decorationNode.createLayoutConstraint(NotationPackage.eINSTANCE.getLocation());
		location.setX(1);
		location.setY(-33);
		
		connector.createStyle(NotationPackage.eINSTANCE.getFontStyle());
		connector.createStyle(NotationPackage.eINSTANCE.getLineStyle());
		connector.setElement(message);
		RelativeBendpoints bendpoints = (RelativeBendpoints) connector.createBendpoints(NotationPackage.eINSTANCE.getRelativeBendpoints());
		bendpoints.setPoints(Arrays.asList(new RelativeBendpoint[] {new RelativeBendpoint(0, 0, -320, 0), new RelativeBendpoint(0, 0, 320, 0)}));


		String sourceId;
		if(message.getMessageKind() == MessageKind.FOUND_LITERAL) {
			Integer y = messagePositions.get(message) + 30;
			sourceId = "(10,"+y+")";
		}
		else{
			Shape leftLIfelineShape = (Shape) connector.getSource();
			Bounds bounds = (Bounds)leftLIfelineShape.getLayoutConstraint();
			double relative = ((double) pos - bounds.getY())/bounds.getHeight();
			sourceId = "(0.5,"+relative+")";
		}
		((IdentityAnchor) connector.createSourceAnchor(NotationPackage.eINSTANCE.getIdentityAnchor())).setId(sourceId);
		
		
		String targetId;
		if(message.getMessageKind() == MessageKind.LOST_LITERAL) {
			targetId = "(20,100)";
		}
		else{
			Shape leftLIfelineShape = (Shape) connector.getTarget();
			Bounds bounds = (Bounds)leftLIfelineShape.getLayoutConstraint();
			double relative = ((double) pos - bounds.getY())/bounds.getHeight();
			targetId = "(0.5,"+relative+")";
		}
		((IdentityAnchor) connector.createTargetAnchor(NotationPackage.eINSTANCE.getIdentityAnchor())).setId(targetId);
		
	}

	private static void drawLifeline(Shape interactionShape, int x, int y, int height, Lifeline lifeline) {
		if(lifelines.containsKey(lifeline)) {
			return;
		}
		BasicCompartment basic = (BasicCompartment) EcoreUtil.getObjectByType(interactionShape.getChildren(), NotationPackage.eINSTANCE.getBasicCompartment());
		Shape lifelineShape = (Shape) basic.createChild(NotationPackage.eINSTANCE.getShape());
		lifelineShape.setType("Lifeline_Shape");
		lifelineShape.setElement(lifeline);
		lifelineShape.createChild(NotationPackage.eINSTANCE.getDecorationNode()).setType("Lifeline_NameLabel");
		Bounds bounds = (Bounds) lifelineShape.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());
		bounds.setX(x);
		bounds.setY(y);
		bounds.setHeight(height);
		bounds.setWidth(100);
		lifelines.put(lifeline, lifelineShape);
	}

	private static Shape drawInteraction(Interaction interaction, Resource notationResource) {
		Diagram diagramShape = NotationFactory.eINSTANCE.createDiagram();
		diagramShape.setName(interaction.getName());
		diagramShape.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		diagramShape.setType("PapyrusUMLSequenceDiagram");
		diagramShape.setElement(interaction);
		notationResource.getContents().add(diagramShape);
		
		Shape interactionShape = (Shape) diagramShape.createChild(NotationPackage.eINSTANCE.getShape());
		interactionShape.setType("Interaction_Shape");
		interactionShape.setElement(interaction);
		
		interactionShape.createChild(NotationPackage.eINSTANCE.getDecorationNode()).setType("Interaction_NameLabel");
		interactionShape.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());
		
		
		BasicCompartment basic = (BasicCompartment) interactionShape.createChild(NotationPackage.eINSTANCE.getBasicCompartment());
		basic.setType("Interaction_SubfragmentCompartment");
		basic.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());
		
		StringValueStyle stringValueStyle = (StringValueStyle) diagramShape.createStyle(NotationPackage.eINSTANCE.getStringValueStyle());
		stringValueStyle.setName("diagram_compatibility_version");
		stringValueStyle.setStringValue("1.4.0");
		
		diagramShape.createStyle(NotationPackage.eINSTANCE.getDiagramStyle());
		
		PapyrusDiagramStyle style = (PapyrusDiagramStyle) diagramShape.createStyle(StylePackage.eINSTANCE.getPapyrusDiagramStyle());
		style.setOwner(interaction);
		style.setDiagramKindId("org.eclipse.papyrus.uml.diagram.sequence");
		
		return interactionShape;
	}
}
