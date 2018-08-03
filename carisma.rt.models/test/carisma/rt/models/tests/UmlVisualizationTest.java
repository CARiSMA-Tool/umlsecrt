package carisma.rt.models.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public class UmlVisualizationTest {

	public static void main(String[] args) {
		ResourceSet set = new ResourceSetImpl();
		Registry packages = set.getPackageRegistry();
		packages.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
		packages.put(NotationPackage.eNS_URI, NotationPackage.eINSTANCE);
		Map<String, Object> factories = set.getResourceFactoryRegistry().getExtensionToFactoryMap();
		factories.put(UMLResource.FILE_EXTENSION, UMLResource.Factory.INSTANCE);
		
		String umlPath = "protocols/Classloader-changed.uml";
		String diPath = umlPath.substring(0, umlPath.length()-3)+"di";
		String notationPath = umlPath.substring(0, umlPath.length()-3)+"notation";
		
		Resource umlResource = set.getResource(URI.createFileURI(umlPath), true);
		Resource diResource = set.createResource(URI.createFileURI(diPath));
		Resource notationResource = set.createResource(URI.createFileURI(notationPath));
		
		try {
			umlResource.load(Collections.EMPTY_MAP);
			if(new File(notationPath).exists()) {
				
			}
		}
		catch (IOException e) {
		}
	}
}
