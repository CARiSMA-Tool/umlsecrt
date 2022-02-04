package org.gravity.eclipse.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.Predicate;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

import org.apache.log4j.Logger;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaModelException;

/**
 * Helpful functionality when working with zip archives
 *
 * @author speldszus
 *
 */
public final class ZipUtil {

	/**
	 * The logger of this class
	 */
	private static final Logger LOGGER = Logger.getLogger(ZipUtil.class);

	/*
	 * Thresholds for avoiding ZIP bombs
	 */
	private static final int THRESHOLD_ENTRIES = 10000;
	private static final int THRESHOLD_SIZE = 1000000000;
	private static final double THRESHOLD_RATIO = 10D;

	private ZipUtil() {
		// This class shouldn't be instantiated
	}

	/**
	 * Unzips a zip file to a given location
	 *
	 * @param zip         - The path of the ZIP file
	 * @param destination - The location to which the ZIP file should be extracted
	 * @throws IOException If the ZIP cannot be extracted
	 */
	public static void unzip(final File zip, final File destination) throws IOException {
		unzip(zip.toPath(), destination.toPath());
	}

	/**
	 * Unzips a zip file to a given location
	 *
	 * @param zip         - The path of the ZIP file
	 * @param destination - The location to which the ZIP file should be extracted
	 * @throws IOException If the ZIP cannot be extracted
	 */
	public static void unzip(final Path zip, final Path destination) throws IOException {
		try (var zipInputStream = new ZipInputStream(Files.newInputStream(zip))) {
			unzip(zipInputStream, destination);
		}
	}

	/**
	 * Unzips a zip file to a given location
	 *
	 * @param zip         - The path of the ZIP file
	 * @param destination - The location to which the ZIP file should be extracted
	 * @param include     A function to decide based on an entries name if it should
	 *                    be extracted or not. If <code>null</code> is passed, all
	 *                    entries will be extracted.
	 * @throws IOException If the ZIP cannot be extracted
	 */
	public static void unzip(final Path zip, final Path destination, final Predicate<String> include)
			throws IOException {
		try (var zipInputStream = new ZipInputStream(Files.newInputStream(zip))) {
			unzip(zipInputStream, destination, include);
		}
	}

	/**
	 * Extracts the ZIP stream to the given destination
	 *
	 * @param stream      The ZIP input stream
	 * @param destination The location to which the ZIP file should be extracted
	 * @throws IOException If the ZIP cannot be extracted
	 */
	public static void unzip(final ZipInputStream stream, final Path destination) throws IOException {
		unzip(stream, destination, null);
	}

	/**
	 * Extracts the ZIP stream to the given destination
	 *
	 * @param stream      The ZIP input stream
	 * @param destination The location to which the ZIP file should be extracted
	 * @param include     A function to decide based on an entries name if it should
	 *                    be extracted or not. If <code>null</code> is passed, all
	 *                    entries will be extracted.
	 * @throws IOException If the ZIP cannot be extracted
	 */
	public static void unzip(final ZipInputStream stream, final Path destination, final Predicate<String> include)
			throws IOException {
		var totalSizeArchive = 0;
		var totalEntryArchive = 0;

		if (!destination.toFile().exists()) {
			Files.createDirectories(destination);
		}

		ZipEntry entry;
		while ((entry = stream.getNextEntry()) != null) {
			try {
				totalEntryArchive++;
				if (totalEntryArchive > THRESHOLD_ENTRIES) {
					throw new SecurityException("Too much entries in this archive");
				}

				final var filePath = new File(destination.toFile(), entry.getName());
				if (!filePath.getCanonicalPath().startsWith(destination.toString())) {
					throw new SecurityException("Entry is trying to leave the target dir: " + entry.getName());
				}

				if (entry.isDirectory()) {
					Files.createDirectories(filePath.toPath());
				} else if ((include == null) || include.test(entry.getName())) {
					totalSizeArchive += unzipFile(stream, filePath.toPath(), entry.getCompressedSize());
					if (totalSizeArchive > THRESHOLD_SIZE) {
						throw new SecurityException(
								"Uncompressed data size is too much for the application resource capacity");
					}
				}
			} finally {
				stream.closeEntry();
			}
		}
	}

	private static int unzipFile(final ZipInputStream zipInputStream, final Path unzipFilePath,
			final long compressedSize) throws IOException {
		Files.createDirectories(unzipFilePath.getParent());
		var totalSizeEntry = 0;
		try (var bos = new BufferedOutputStream(Files.newOutputStream(unzipFilePath, StandardOpenOption.CREATE))) {
			final var bytesIn = new byte[1024];
			var read = 0;
			while ((read = zipInputStream.read(bytesIn)) != -1) {
				bos.write(bytesIn, 0, read);
				totalSizeEntry += read;

				final var compressionRatio = totalSizeEntry / (double) compressedSize;
				if (compressionRatio > THRESHOLD_RATIO) {
					throw new SecurityException(
							"Ratio between compressed and uncompressed data is highly suspicious, looks like a Zip Bomb Attack");
				}
			}
		}
		return totalSizeEntry;

	}

	/**
	 * Compresses a Java project into a zip file
	 *
	 * @param project The Java project
	 * @param zip     The output file
	 * @throws IOException
	 */
	public static void zipProject(final IJavaProject project, final File zip) throws IOException {
		Path outPath = null;
		try {
			final var out = project.getOutputLocation();
			if (out != null) {
				outPath = out.toFile().toPath();
			}
		} catch (final JavaModelException e) {
			LOGGER.error("Binaries might be included in ZIP", e);
		}
		final var ignore = outPath;
		final var root = project.getProject().getLocation().toFile().toPath();
		try (var stream = new ZipOutputStream(new FileOutputStream(zip))) {
			Files.walkFileTree(root, new SimpleFileVisitor<Path>() {
				@Override
				public FileVisitResult visitFile(final Path file, final BasicFileAttributes attrs) throws IOException {
					if (file.startsWith(ignore)) {
						return FileVisitResult.SKIP_SUBTREE;
					}
					stream.putNextEntry(new ZipEntry(root.relativize(file).toString()));
					Files.copy(file, stream);
					stream.closeEntry();
					return FileVisitResult.CONTINUE;
				}
			});
		}
	}
}
