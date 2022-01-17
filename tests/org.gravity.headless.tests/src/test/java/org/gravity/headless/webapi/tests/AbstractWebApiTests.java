package org.gravity.headless.webapi.tests;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

import javax.ws.rs.core.Response;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.gravity.eclipse.io.FileUtils;
import org.gravity.headless.webapi.impl.ProgramModelApiServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

/**
 * The instantiation and cleanup of tests for GRaViTY's API
 *
 * @author speldszus
 *
 */
@TestInstance(Lifecycle.PER_CLASS)
abstract class AbstractWebApiTests {

	/**
	 * The cache location of the tests
	 */
	File cache;

	/**
	 * Instantiates a temporary cache location
	 *
	 * @throws IOException
	 */
	@BeforeEach
	public void initCache() throws IOException {
		this.cache = FileUtils.createTempDirectory(this.getClass().getName()).toFile();
	}



	/**
	 * Deletes the temporary cache
	 */
	@AfterEach
	public void cleanUp() {
		FileUtils.recursiveDelete(this.cache);
	}

	/**
	 * Reads the EMF resource from GRaViTY's response message
	 *
	 * @param response The response message
	 * @return The loaded EMF resource
	 * @throws IOException If the resource cannot be loaded
	 */
	Resource getResource(final Response response) throws IOException {
		final var resource = new ResourceSetImpl().createResource(URI.createURI("pm.xmi"));
		final var string = response.readEntity(String.class);
		try (var stream = new ByteArrayInputStream(string.getBytes())) {
			resource.load(stream, Collections.emptyMap());
		}
		return resource;
	}

	/**
	 * Creates a mock instance of the GRaViTY web service
	 *
	 * @param cache The location where models should be cached
	 * @return The instance
	 * @throws IOException
	 */
	ProgramModelApiServiceImpl getService(final File cache) throws IOException {
		final var service = new ProgramModelApiServiceImpl();
		service.setMaxModels(1);
		service.setMaxRepositories(1);
		service.setCache(cache);
		return service;
	}

}