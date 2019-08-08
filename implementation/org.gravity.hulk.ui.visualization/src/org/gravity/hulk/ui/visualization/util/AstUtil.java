package org.gravity.hulk.ui.visualization.util;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class AstUtil {

	private static final Logger LOGGER = Logger.getLogger(AstUtil.class);

	public static int findLineNumberOfTypeDeclaration(IFile iFile, String typeName) {
		List<Integer> resultLine = new ArrayList<Integer>();
		resultLine.add(-1);
		try {
			LineNumberReader reader = new LineNumberReader(new InputStreamReader(iFile.getContents(), "UTF-8"));
			StringBuilder builder = new StringBuilder();
			String line = reader.readLine();
			while (line != null) {
				builder.append(line);
				builder.append('\n');
				line = reader.readLine();
			}
			ASTParser parser = ASTParser.newParser(AST.JLS11);
			parser.setKind(ASTParser.K_COMPILATION_UNIT);
			parser.setResolveBindings(true);
			parser.setSource(builder.toString().toCharArray());
			CompilationUnit unit = (CompilationUnit) parser.createAST(null);
			unit.accept(new ASTVisitor() {

				public boolean visit(TypeDeclaration node) {
					if (typeName.equals(node.getName().toString())) {
						resultLine.set(0, unit.getLineNumber(node.getStartPosition()));
						return false;
					}
					return true;
				}
			});
		} catch (CoreException | IOException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return resultLine.get(0);
	}

	public static int findFileWithTypeDeclaration(IFolder iFolder, String declarationName, List<IFile> resultList) {
		try {
			for (IResource resource : iFolder.members()) {
				if (resource instanceof IFile) {
					IFile myfile = (IFile) resource;
					int lineNumber = findLineNumberOfTypeDeclaration(myfile, declarationName);
					if (lineNumber != -1) {
						resultList.add(myfile);
						return lineNumber;
					}
				}
			}
		} catch (CoreException e) {
			LOGGER.log(Level.ERROR, e.getLocalizedMessage(), e);
		}
		return -1;
	}
}
