package carisma.rt.models.loader;

import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ModelLoader {
	
	private ResourceSet set;

	public ModelLoader() {
		set = new ResourceSetImpl();
		Registry packageRegistry = set.getPackageRegistry();
		packageRegistry.put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);

		set.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION,
				UMLResource.Factory.INSTANCE);
	}
	
	public Model getModel(String modelLocation) {
		if (modelLocation == null) {
			return null;
		}
		Resource resource = set.getResource(URI.createFileURI(modelLocation), true);
		try {
			resource.load(Collections.emptyMap());
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return (Model) resource.getContents().get(0);
	}
}
