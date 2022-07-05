package org.gravity.eclipse.io;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.ResetCommand.ResetType;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.JGitInternalException;
import org.eclipse.jgit.errors.NoWorkTreeException;

/**
 * Functionalities to easily clone GIT repositories and change versions
 *
 * @author speldszus
 *
 */
public class GitTools implements Closeable {

	/**
	 * The logger of this class
	 */
	public static final Logger LOGGER = Logger.getLogger(GitTools.class);

	/**
	 * An internal instance of the JGit client
	 */
	private Git git;

	private final File repository;

	/**
	 * Creates a new client and clones the repository
	 *
	 * @param url         The url of a public GIT repository
	 * @param destination The destination to which the repository should be cloned
	 * @param replace     if existing content at the destination should be replaced
	 * @param submodules  if submodules should be cloned
	 * @throws GitCloneException If cloning the repository failed
	 */
	public GitTools(final String url, final File destination, final boolean replace, final boolean submodules)
			throws GitCloneException {
		if (!destination.exists()) {
			destination.mkdirs();
		}
		final var productName = url.substring(url.lastIndexOf('/') + 1, url.length() - 4);
		this.repository = new File(destination, productName);
		if (getRepositoryLocation().exists()) {
			if (replace) {
				if (!FileUtils.recursiveDelete(getRepositoryLocation())) {
					throw new GitCloneException("There is already a repository with the name \"" + productName
							+ "\" which couldn't be deleted.");
				}
			} else {
				throw new GitCloneException("There is already a repository with the name \"" + productName + "\".");
			}
		}
		try {
			this.git = Git.cloneRepository().setDirectory(getRepositoryLocation()).setURI(url)
					.setCloneSubmodules(submodules).call();
		} catch (final GitAPIException e) {
			LOGGER.error(e.getMessage(), e);
			throw new GitCloneException(e);
		}
	}

	/**
	 * Checks out the specified version of the repository
	 *
	 * @param id The id of the commit
	 * @return true, iff the version change was successful
	 */
	public boolean changeVersion(final String id) {
		try {
			final var ref = this.git.reset().setMode(ResetType.HARD).setRef(id).call();
			if ((ref != null)) {
				final var object = ref.getObjectId();
				return (object != null) && object.getName().startsWith(id);
			}
		} catch (NoWorkTreeException | GitAPIException | JGitInternalException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return false;
	}

	@Override
	public void close() throws IOException {
		this.git.getRepository().close();
	}

	/**
	 * Gets the location of the repository
	 *
	 * @return The folder containing the repository
	 */
	public File getRepositoryLocation() {
		return this.repository;
	}
}
