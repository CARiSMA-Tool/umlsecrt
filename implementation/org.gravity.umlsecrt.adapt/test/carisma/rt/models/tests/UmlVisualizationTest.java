package carisma.rt.models.tests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmf.runtime.notation.BasicCompartment;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.DecorationNode;
import org.eclipse.gmf.runtime.notation.Diagram;
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
import org.eclipse.gmf.runtime.notation.datatype.RelativeBendpoint;
import org.eclipse.papyrus.infra.gmfdiag.style.PapyrusDiagramStyle;
import org.eclipse.papyrus.infra.gmfdiag.style.StylePackage;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageEnd;
import org.eclipse.uml2.uml.MessageKind;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.MessageSort;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

import carisma.rt.models.sync.ModelSync;

public class UmlVisualizationTest {

	private static HashMap<Lifeline, Shape> lifelines = new HashMap<>();
	private static HashMap<Message, Integer> messagePositions = new HashMap<>();

	public static void main(final String[] args) {
		final ResourceSet set = new ResourceSetImpl();
		final Registry packages = set.getPackageRegistry();
		packages.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		packages.put(NotationPackage.eNS_URI, NotationPackage.eINSTANCE);
		packages.put(StylePackage.eNS_URI, StylePackage.eINSTANCE);
		final Map<String, Object> factories = set.getResourceFactoryRegistry().getExtensionToFactoryMap();
		factories.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		factories.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		final String umlPath = new File("protocols/Classloader-changed.uml").getAbsolutePath();

		final Resource umlResource = set.getResource(URI.createFileURI(umlPath), true);
		try {
			umlResource.load(Collections.emptyMap());
		} catch (final IOException e) {
			return;
		}
		final Model model = (Model) umlResource.getContents().get(0);
		final Interaction interaction = (Interaction) EcoreUtil.getObjectByType(
				((Model) model.getPackagedElement(ModelSync.UNKNOWN_CLASSIFIERS)).getPackagedElements(),
				UMLPackage.eINSTANCE.getInteraction());

		drawSequenceDiagram(interaction);

	}

	private static void drawSequenceDiagram(final Interaction interaction) {
		final Resource umlResource = interaction.eResource();
		final ResourceSet set = umlResource.getResourceSet();

		final String umlURI = umlResource.getURI().toFileString();

		final String notationPath = umlURI.substring(0, umlURI.length() - 3) + "notation";
		final String diPath = umlURI.substring(0, umlURI.length() - 3) + "di";

		Resource notationResource;
		Resource diResource;
		try {
			final URI notationURI = URI.createFileURI(notationPath);
			if (new File(notationPath).exists()) {
				notationResource = set.getResource(notationURI, true);
				notationResource.load(Collections.emptyMap());
			} else {
				notationResource = set.createResource(notationURI);
			}

			final URI diURI = URI.createFileURI(diPath);
			if (new File(diPath).exists()) {
				diResource = set.getResource(diURI, true);
				diResource.load(Collections.emptyMap());
			} else {
				diResource = set.createResource(diURI);
			}
		} catch (final IOException e) {
			return;
		}

		final Shape interactionShape = drawInteraction(interaction, notationResource);

		int x = 50;
		final int y = 10;
		final int height = 10 + (interaction.getMessages().size()*100);
		for(final Lifeline lifeline : interaction.getLifelines()) {
			drawLifeline(interactionShape, x, y, height, lifeline);
			x += 200;
		}

		int counter = 0;
		for(final Message message : interaction.getMessages()) {

			final int absolutePos = 70+(100*counter);

			messagePositions.put(message, absolutePos);

			drawMessage(interactionShape, absolutePos, message);

			counter++;
		}

		for(final InteractionFragment fragment : interaction.getFragments()) {
			if (fragment instanceof BehaviorExecutionSpecification) {
				final BehaviorExecutionSpecification behavior = (BehaviorExecutionSpecification) fragment;
				final Shape lifelineShape = lifelines.get(behavior.getCovereds().get(0));

				final Shape behaviorShape = (Shape) lifelineShape.createChild(NotationPackage.eINSTANCE.getShape());
				behaviorShape.setType("BehaviorExecutionSpecification_Shape");
				behaviorShape.setElement(behavior);

				final Bounds behaviorLocation = (Bounds) behaviorShape.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());
				behaviorLocation.setX(40);
				behaviorLocation.setWidth(20);

				final int s = messagePositions.get(((MessageOccurrenceSpecification) behavior.getStart()).getMessage());
				final int h = messagePositions.get(((MessageOccurrenceSpecification) behavior.getFinish()).getMessage()) - s;

				behaviorLocation.setY(s-5);
				behaviorLocation.setHeight(h);

				final DecorationNode decorationNode = (DecorationNode) behaviorShape.createChild(NotationPackage.eINSTANCE.getDecorationNode());
				decorationNode.setType("BehaviorExecutionSpecification_Behavior");

				final Location location = (Location) decorationNode.createLayoutConstraint(NotationPackage.eINSTANCE.getLocation());
				location.setX(18);
				location.setY(18);
			}
		}

		try {
			notationResource.save(Collections.emptyMap());
			diResource.save(Collections.emptyMap());
		} catch (final IOException e) {

		}
	}

	private static void drawMessage(final Shape interactionShape, final int pos, final Message message) {
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

		if(edgeKind== null) {
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
		}

		final Diagram diagram = (Diagram) interactionShape.eContainer();

		final Connector connector = (Connector) diagram.createEdge(NotationPackage.eINSTANCE.getConnector());
		connector.setType(edgeKind);

		final MessageEnd receive = message.getReceiveEvent();
		if (receive instanceof MessageOccurrenceSpecification) {
			final Shape rightLifelineShape = lifelines.get(((MessageOccurrenceSpecification) receive).getCovered());
			connector.setTarget(rightLifelineShape);
			if(message.getMessageSort() == MessageSort.CREATE_MESSAGE_LITERAL) {
				final LayoutConstraint constraint = rightLifelineShape.getLayoutConstraint();
				if (constraint instanceof Bounds) {
					final Bounds bounds = (Bounds) constraint;
					bounds.setY(messagePositions.get(message));
					final int oldHeight = bounds.getHeight();
					final int newHeight = oldHeight-bounds.getY();
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

		final MessageEnd send = message.getSendEvent();
		if (send instanceof MessageOccurrenceSpecification) {
			final Shape leftLifelineShape = lifelines.get(((MessageOccurrenceSpecification) send).getCovered());
			connector.setSource(leftLifelineShape);
		}
		else if(message.getMessageKind() == MessageKind.FOUND_LITERAL){
			connector.setSource(interactionShape);
		}
		else {
			throw new RuntimeException();
		}

		final Node nameLabelDecorationNode = connector.createChild(NotationPackage.eINSTANCE.getDecorationNode());
		nameLabelDecorationNode.setType(labelKind);
		final Location nameLabelLocation = (Location) nameLabelDecorationNode.createLayoutConstraint(NotationPackage.eINSTANCE.getLocation());
		nameLabelLocation.setX(1);
		nameLabelLocation.setY(-13);


		final Node decorationNode = connector.createChild(NotationPackage.eINSTANCE.getDecorationNode());
		decorationNode.setType(stereotypeKind);
		final Location location = (Location) decorationNode.createLayoutConstraint(NotationPackage.eINSTANCE.getLocation());
		location.setX(1);
		location.setY(-33);

		connector.createStyle(NotationPackage.eINSTANCE.getFontStyle());
		connector.createStyle(NotationPackage.eINSTANCE.getLineStyle());
		connector.setElement(message);
		final RelativeBendpoints bendpoints = (RelativeBendpoints) connector.createBendpoints(NotationPackage.eINSTANCE.getRelativeBendpoints());
		bendpoints.setPoints(Arrays.asList(new RelativeBendpoint(0, 0, -320, 0), new RelativeBendpoint(0, 0, 320, 0)));


		String sourceId;
		if(message.getMessageKind() == MessageKind.FOUND_LITERAL) {
			final Integer y = messagePositions.get(message) + 30;
			sourceId = "(10,"+y+")";
		}
		else{
			final Shape leftLIfelineShape = (Shape) connector.getSource();
			final Bounds bounds = (Bounds)leftLIfelineShape.getLayoutConstraint();
			final double relative = ((double) pos - bounds.getY())/bounds.getHeight();
			sourceId = "(0.5,"+relative+")";
		}
		((IdentityAnchor) connector.createSourceAnchor(NotationPackage.eINSTANCE.getIdentityAnchor())).setId(sourceId);


		String targetId;
		if(message.getMessageKind() == MessageKind.LOST_LITERAL) {
			targetId = "(20,100)";
		}
		else{
			final Shape leftLIfelineShape = (Shape) connector.getTarget();
			final Bounds bounds = (Bounds)leftLIfelineShape.getLayoutConstraint();
			final double relative = ((double) pos - bounds.getY())/bounds.getHeight();
			targetId = "(0.5,"+relative+")";
		}
		((IdentityAnchor) connector.createTargetAnchor(NotationPackage.eINSTANCE.getIdentityAnchor())).setId(targetId);

	}

	private static void drawLifeline(final Shape interactionShape, final int x, final int y, final int height, final Lifeline lifeline) {
		if(lifelines.containsKey(lifeline)) {
			return;
		}
		final BasicCompartment basic = (BasicCompartment) EcoreUtil.getObjectByType(interactionShape.getChildren(), NotationPackage.eINSTANCE.getBasicCompartment());
		final Shape lifelineShape = (Shape) basic.createChild(NotationPackage.eINSTANCE.getShape());
		lifelineShape.setType("Lifeline_Shape");
		lifelineShape.setElement(lifeline);
		lifelineShape.createChild(NotationPackage.eINSTANCE.getDecorationNode()).setType("Lifeline_NameLabel");
		final Bounds bounds = (Bounds) lifelineShape.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());
		bounds.setX(x);
		bounds.setY(y);
		bounds.setHeight(height);
		bounds.setWidth(100);
		lifelines.put(lifeline, lifelineShape);
	}

	private static Shape drawInteraction(final Interaction interaction, final Resource notationResource) {
		final Diagram diagramShape = NotationFactory.eINSTANCE.createDiagram();
		diagramShape.setName(interaction.getName());
		diagramShape.setMeasurementUnit(MeasurementUnit.PIXEL_LITERAL);
		diagramShape.setType("PapyrusUMLSequenceDiagram");
		diagramShape.setElement(interaction);
		notationResource.getContents().add(diagramShape);

		final Shape interactionShape = (Shape) diagramShape.createChild(NotationPackage.eINSTANCE.getShape());
		interactionShape.setType("Interaction_Shape");
		interactionShape.setElement(interaction);

		interactionShape.createChild(NotationPackage.eINSTANCE.getDecorationNode()).setType("Interaction_NameLabel");
		interactionShape.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());


		final BasicCompartment basic = (BasicCompartment) interactionShape.createChild(NotationPackage.eINSTANCE.getBasicCompartment());
		basic.setType("Interaction_SubfragmentCompartment");
		basic.createLayoutConstraint(NotationPackage.eINSTANCE.getBounds());

		final StringValueStyle stringValueStyle = (StringValueStyle) diagramShape.createStyle(NotationPackage.eINSTANCE.getStringValueStyle());
		stringValueStyle.setName("diagram_compatibility_version");
		stringValueStyle.setStringValue("1.4.0");

		diagramShape.createStyle(NotationPackage.eINSTANCE.getDiagramStyle());

		final PapyrusDiagramStyle style = (PapyrusDiagramStyle) diagramShape.createStyle(StylePackage.eINSTANCE.getPapyrusDiagramStyle());
		style.setOwner(interaction);
		style.setDiagramKindId("org.eclipse.papyrus.uml.diagram.sequence");

		return interactionShape;
	}
}
