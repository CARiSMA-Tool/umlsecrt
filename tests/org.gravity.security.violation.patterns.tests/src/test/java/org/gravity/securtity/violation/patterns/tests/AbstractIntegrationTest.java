package org.gravity.securtity.violation.patterns.tests;

import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.gravity.eclipse.util.EclipseProjectUtil;
import org.junit.Test;

public abstract class AbstractIntegrationTest {

	@Test
	public void testIntegration() throws IOException, CoreException {
		BasicConfigurator.configure();

		final var monitor = new NullProgressMonitor();
		final var location = new File("instances/SecureViolationPatternsViolation");
		final var project = EclipseProjectUtil.importProject(location, monitor);
		assertNotNull("Couldn't load the test project", project);

		run(project, monitor);
	}

	protected abstract void run(IProject project, NullProgressMonitor monitor);

}
