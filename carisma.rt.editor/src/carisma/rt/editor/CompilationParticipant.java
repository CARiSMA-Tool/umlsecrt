package carisma.rt.editor;

import java.util.Stack;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jdt.core.compiler.BuildContext;
import org.gravity.security.annotations.requirements.High;
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class CompilationParticipant extends org.eclipse.jdt.core.compiler.CompilationParticipant {

	@Override
	public boolean isActive(IJavaProject project) {
		return project.getProject().isOpen();
	}

	@Override
	public boolean isAnnotationProcessor() {
		return true;
	}

	@Override
	public void processAnnotations(BuildContext[] files) {
		for (BuildContext file : files) {
			IFile iFile = file.getFile();
			ICompilationUnit cu = (ICompilationUnit) JavaCore.create(iFile);
			try {
				for (IType type : cu.getTypes()) {
					for (IMethod child : type.getMethods()) {
						process(child.getAnnotations(), type);
					}
					for (IField child : type.getFields()) {
						process(child.getAnnotations(), type);
					}
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	private void process(IAnnotation[] annotations, IType type) {
		for (IAnnotation annotation : annotations) {
			try {
				String[][] resolved = type.resolveType(annotation.getElementName());
				if (resolved == null) {
					continue;
				}
				for (String[] element : resolved) {
					String fullyQualifiedName = element[0] + '.' + element[1];
					String earlyReturn = null;
					if (fullyQualifiedName.equals(Secrecy.class.getName())
							|| fullyQualifiedName.equals(Integrity.class.getName())
							|| fullyQualifiedName.equals(High.class.getName())) {
						IMemberValuePair[] pairs = annotation.getMemberValuePairs();
						if (pairs.length == 0) {
							continue;
						}
						for (IMemberValuePair pair : pairs) {
							if (pair.getMemberName().equals("earlyReturn")) {
								earlyReturn = (String) pair.getValue();
								break;
							}
						}
					} else {
						continue;
					}
					if (earlyReturn == null) {
						continue;
					}
					earlyReturn = earlyReturn.trim();
					if (earlyReturn.length() == 0) {
						continue;
					}
					String typeSignature = null;
					IJavaElement parent = annotation.getParent();
					if (parent.getElementType() == IJavaElement.METHOD) {
						typeSignature = ((IMethod) parent).getReturnType();
					} else if (parent.getElementType() == IJavaElement.FIELD) {
						typeSignature = ((IField) parent).getTypeSignature();
					}
					String typeName = Signature.toString(typeSignature);

					if ("void".equals(earlyReturn.toLowerCase())) {
						continue;
					} else if ("true".equals(earlyReturn.toLowerCase()) || "false".equals(earlyReturn.toLowerCase())) {
						if (!Signature.SIG_BOOLEAN.equals(typeName)) {
							createMarker(type, annotation,
									"The method \"" + earlyReturn + "\" has to return a boolean value.");
						}
					} else if ('"' == earlyReturn.charAt(0) && earlyReturn.charAt(earlyReturn.length() - 1) == '"') {
						boolean isString = false;
						for (String[] entry : type.resolveType(typeName)) {
							if ("String".equals(entry[1]) && "java.lang".equals(entry[0])) {
								isString = true;
								break;
							}
						}
						if (!isString) {
							createMarker(type, annotation, "The \"java.lang.String\" value \"" + earlyReturn
									+ "\" is not compatible with the return type \"" + typeName + "\".");
						}
					} else {
						try {
							int value = Integer.parseInt(earlyReturn);
							if (!Signature.SIG_INT.equals(typeSignature)
									&& !(Signature.SIG_BYTE.equals(typeSignature) && -128 <= value && value <= 127)
									&& !(Signature.SIG_CHAR.equals(typeSignature) && Character.MIN_VALUE <= value
											&& value <= Character.MAX_VALUE)) {
								createMarker(type, annotation, "The int value \"" + earlyReturn
										+ "\" is not compatible with the return type \"" + typeName + "\".");
							}
						} catch (NumberFormatException e0) {
							try {
								double value = Double.parseDouble(earlyReturn);
								if (!Signature.SIG_DOUBLE.equals(typeSignature)
										&& !(Signature.SIG_FLOAT.equals(typeSignature) && Float.MIN_VALUE <= value
												&& value <= Float.MAX_VALUE)) {
									createMarker(type, annotation, "The double value \"" + earlyReturn
											+ "\" is not compatible with the return type \"" + typeName + "\".");
								}
							} catch (NumberFormatException e1) {
								IMethod foundMethod = null;
								for (IMethod m : type.getMethods()) {
									if (m.getElementName().equals(earlyReturn)) {
										foundMethod = m;
										if (m.getNumberOfParameters() != 0) {
											try {
												createMarker(type, annotation,
														"Only methods without parameters are allowed for as early return values.");
											} catch (CoreException e) {
												e.printStackTrace();
											}
										}
									}
								}
								if (foundMethod != null) {
									boolean correctReturnType = false;
									typeName = replacePrimitiveWithObject(typeName);
									String[][] resolvedNeededTypes = type.resolveType(typeName);
									String[][] resolvedReturnTypes = type.resolveType(replacePrimitiveWithObject(
											Signature.toString(foundMethod.getReturnType())));
									for (String[] neededEntry : resolvedNeededTypes) {
										String neededTypeSignature = neededEntry[0] + '.' + neededEntry[1];
										for (String[] returnEntry : resolvedReturnTypes) {
											Stack<String> returnTypes = new Stack<String>();
											returnTypes.add('Q' + returnEntry[0] + '.' + returnEntry[1] + ';');
											while (!returnTypes.isEmpty()) {
												String pop = returnTypes.pop();
												String returnTypeSignature = Signature.toString(pop).replaceAll("<.*>",
														"");
												if (returnTypeSignature.equals(neededTypeSignature)) {
													correctReturnType = true;
													break;
												} else {
													IType returnType = type.getJavaProject()
															.findType(returnTypeSignature);
													String superclassTypeSignature = returnType
															.getSuperclassTypeSignature();
													if (superclassTypeSignature != null) {
														returnTypes.add(superclassTypeSignature);
													}
													for (String interfaceSignature : returnType
															.getSuperInterfaceTypeSignatures()) {
														returnTypes.add(interfaceSignature);
													}
												}
											}
											if (correctReturnType) {
												break;
											}
										}
										if (correctReturnType) {
											break;
										}
									}
									if (!correctReturnType) {
										createMarker(type, annotation,
												"The method \"" + earlyReturn + "\" has to return an instance of \""
														+ Signature.toString(typeName) + "\".");
									}
								} else {
									try {
										createMarker(type, annotation, "There is no method with the name \""
												+ earlyReturn + "\" in this class.");
									} catch (CoreException e) {
										e.printStackTrace();
									}
								}
							}
						}
					}
				}

			} catch (JavaModelException e) {
				e.printStackTrace();
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}

	private void createMarker(IType type, IAnnotation annotation, String message)
			throws CoreException, JavaModelException {
		IMarker marker = type.getResource().createMarker("org.gravity.carisma.rt.markers");
		marker.setAttribute(IMarker.MESSAGE, message);
		int offset = annotation.getNameRange().getOffset();
		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		long line = type.getCompilationUnit().getSource().substring(0, offset).chars()
				.filter(w -> (w == '\n' || w == '\r')).count();
		marker.setAttribute(IMarker.LINE_NUMBER, (int) line + 1);
		marker.setAttribute(IMarker.CHAR_START, offset);
		marker.setAttribute(IMarker.CHAR_END, offset + annotation.getNameRange().getLength());
	}

	private String replacePrimitiveWithObject(String typeName) {
		if (typeName.equals("byte")) {
			typeName = "Byte";
		} else if (typeName.equals("int")) {
			typeName = "Integer";
		} else if (typeName.equals("double")) {
			typeName = "Double";
		} else if (typeName.equals("boolean")) {
			typeName = "Boolean";
		} else if (typeName.equals("char")) {
			typeName = "Character";
		} else if (typeName.equals("float")) {
			typeName = "Float";
		} else if (typeName.equals("short")) {
			typeName = "Short";
		} else if (typeName.equals("long")) {
			typeName = "Long";
		}
		return typeName;
	}

}
