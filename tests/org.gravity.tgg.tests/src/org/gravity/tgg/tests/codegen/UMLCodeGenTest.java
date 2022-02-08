package org.gravity.tgg.tests.codegen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLFactory;
import org.gravity.eclipse.exceptions.TransformationFailedException;
import org.gravity.eclipse.importer.DuplicateProjectNameException;
import org.gravity.eclipse.util.EMFUtil;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.gravity.eclipse.util.JavaASTUtil;
import org.gravity.eclipse.util.JavaProjectUtil;
import org.gravity.tgg.uml.Transformation;
import org.junit.Test;

/**
 * Tests for the code generation from UML models
 *
 * @author speldszus
 *
 */
public class UMLCodeGenTest {

	private static final String PROJECT_NAME = "CodeGenTest";
	private static final String PACKAGE_NAME = "namespace";
	private static final String TYPE_NAME = "Type";

	@Test
	public void testSimpleCodeGen()
			throws CoreException, IOException, TransformationFailedException, DuplicateProjectNameException {
		BasicConfigurator.configure();
		final var monitor = new NullProgressMonitor();
		final var project = EclipseProjectUtil.createProject(PROJECT_NAME, true, monitor);
		try {
			final var umlFile = Transformation.getUMLFile(project, monitor);
			generateUMLModel(umlFile);

			final var status = Transformation.generateCode(project, umlFile, monitor);
			assertEquals(Status.OK_STATUS, status);

			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);

			final var srcFile= project.getFile("src/"+PACKAGE_NAME+'/'+TYPE_NAME+".java");
			assertTrue(srcFile.exists());

			final var java = JavaProjectUtil.getJavaProject(project);
			final var types = JavaASTUtil.getTypesForProject(java);
			assertTrue(types.containsKey(PACKAGE_NAME+'.'+TYPE_NAME));
		} finally {
			project.delete(true, monitor);
		}
	}

	/**
	 * Generates a simple UML model with one class
	 *
	 * @param umlFile The file to which the model should be written
	 * @return The generated model
	 * @throws IOException
	 */
	private Model generateUMLModel(final IFile umlFile) throws IOException {
		final var resource = new ResourceSetImpl().createResource(EMFUtil.getPlatformResourceURI(umlFile));
		final var root = UMLFactory.eINSTANCE.createModel();
		root.setName(PROJECT_NAME);
		root.createNestedPackage(PACKAGE_NAME).createOwnedClass(TYPE_NAME, false);
		resource.getContents().add(root);
		resource.save(Collections.emptyMap());
		return root;
	}
}
