package org.gravity.tgg.modisco.test.preprocessing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.gravity.modisco.MGravityModel;
import org.gravity.tgg.modisco.preprocessing.MoDiscoTGGPreprocessing;
import org.gravity.tgg.modisco.preprocessing.PreprocessingFactory;
import org.gravity.tgg.modisco.test.util.CustomFeatureFilter;
import org.gravity.tgg.modisco.test.util.TestBody;
import org.gravity.typegraph.basic.TElementWithId;
import org.junit.Assert;

public class TestGeneratorPreprocessing {

	public static Comparison runTest_ForwardTransformation(final TestBody testcase) {

		// Set up logging
		BasicConfigurator.configure();

		// Forward Transformation
		final TestGeneratorPreprocessing helper = new TestGeneratorPreprocessing(testcase);
		helper.performPreprocessing();
		return helper.compare();
	}

	private final TestBody testcase;

	private final Path resultXMI;

	public TestGeneratorPreprocessing(final TestBody testcase) {

		this.testcase = testcase;

		this.validateTestcase(testcase);

		this.resultXMI = this.createPath("result");
	}

	public void validateTestcase(final TestBody testcase) {
		if (testcase.getSrcXMI() == null || !Files.isReadable(testcase.getSrcXMI())) {
			throw new AssertionError(String.format("Unable to read src xmi: %s", testcase.getSrcXMI()));
		}
		if (testcase.getExpXMI() == null || !Files.isReadable(testcase.getExpXMI())) {
			throw new AssertionError(String.format("Unable to read expected xmi: %s", testcase.getExpXMI()));
		}
		if (testcase.getOutFolder() == null || !Files.isDirectory(testcase.getOutFolder())) {
			throw new AssertionError(String.format("Output folder must exist: %s", testcase.getOutFolder()));
		}
	}

	public final ResourceSet loadResourceSet(final Path path) {
		final URI uri = URI.createURI(path	.toUri()
											.toString());

		final ResourceSet resourceSet = new ResourceSetImpl();
		this.removeIDs(resourceSet.getResource(uri, true));

		return resourceSet;
	}

	public final Comparison compare() {
		Resource.Factory.Registry.INSTANCE	.getExtensionToFactoryMap()
											.put("xmi", new XMIResourceFactoryImpl());

		final ResourceSet resSet = this.loadResourceSet(this.resultXMI);
		final ResourceSet expSet = this.loadResourceSet(this.testcase.getExpXMI());

		final IDiffProcessor diffProcessor = new DiffBuilder();
		final IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
			@Override
			protected FeatureFilter createFeatureFilter() {
				return new CustomFeatureFilter(false).addIgnoredAttribute("ID");
			}
		};

		final IComparisonScope scope = new DefaultComparisonScope(resSet, expSet, null);
		final Comparison comparison = EMFCompare.builder()
												.setDiffEngine(diffEngine)
												.build()
												.compare(scope);

		return comparison;
	}

	private void removeIDs(final Resource r) {
		final TreeIterator<EObject> iterator = r.getAllContents();
		while (iterator.hasNext()) {
			final EObject next = iterator.next();
			if (next instanceof TElementWithId) {
				((TElementWithId) next).setID(0);
			}
		}
	}

	private void performPreprocessing() {
		try {
			this.deleteFile(this.resultXMI);
			ResourceSet set = new ResourceSetImpl();
			Resource res = set.createResource(URI.createFileURI(this.testcase.getSrcXMI().toString()));
			res.load(Collections.EMPTY_MAP);
			
			MoDiscoTGGPreprocessing preprocessing = PreprocessingFactory.eINSTANCE.createMoDiscoTGGPreprocessing();
			MGravityModel model = (MGravityModel)res.getContents().get(0);
			
			Assert.assertTrue(preprocessing.preprocess(model));
			
			res.setURI(URI.createFileURI(resultXMI.toString()));
			res.save(Collections.EMPTY_MAP);

		} catch (final IllegalArgumentException iae) {
			throw new AssertionError(String.format("Unable to load '%s': %s", this.testcase, iae.getMessage()));
		} catch (IOException e) {
			throw new AssertionError(String.format("Unable to save result xmi '%s': %s", this.resultXMI, e.getMessage()));
		}

		Assert.assertTrue("Expected: File with transformed typegraph, but no file was created.",
				Files.exists(this.resultXMI));

	}

	private Path createPath(final String type) {

		String fileName;
		if (type == null || type.isEmpty()) {
			fileName = String.format("%s.xmi", this.testcase.getTestName());
		} else {
			fileName = String.format("%s.%s.xmi", this.testcase.getTestName(), type);
		}

		return this.testcase.getOutFolder()
							.resolve(fileName);
	}

	private void deleteFile(final Path path) {
		try {
			Files.deleteIfExists(path);
		} catch (final IOException e) {
			throw new AssertionError(e);
		}
	}

}
