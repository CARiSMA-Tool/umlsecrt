package carisma.rt.editor;

import java.util.Collections;
import java.util.Stack;

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
import org.gravity.security.annotations.requirements.Integrity;
import org.gravity.security.annotations.requirements.Secrecy;

public class CompilationParticipant extends org.eclipse.jdt.core.compiler.CompilationParticipant {

	@Override
	public boolean isActive(final IJavaProject project) {
		return project.getProject().isOpen();
	}

	@Override
	public boolean isAnnotationProcessor() {
		return true;
	}

	@Override
	public void processAnnotations(final BuildContext[] files) {
		for (final BuildContext file : files) {
			final var iFile = file.getFile();
			final var cu = (ICompilationUnit) JavaCore.create(iFile);
			try {
				for (final IType type : cu.getTypes()) {
					for (final IMethod child : type.getMethods()) {
						this.process(child.getAnnotations(), type);
					}
					for (final IField child : type.getFields()) {
						this.process(child.getAnnotations(), type);
					}
				}
			} catch (final JavaModelException e) {
				e.printStackTrace();
			}
		}
	}

	private void process(final IAnnotation[] annotations, final IType type) {
		for (final IAnnotation annotation : annotations) {
			try {
				final var resolved = type.resolveType(annotation.getElementName());
				if (resolved == null) {
					continue;
				}
				for (final String[] element : resolved) {
					final var earlyReturn = this.getEarlyReturn(element[0] + '.' + element[1], annotation);
					if ((earlyReturn == null) || (earlyReturn.length() == 0)) {
						continue;
					}
					final var typeSignature = this.getTypeSignature(annotation);
					var typeName = Signature.toString(typeSignature);

					if ("void".equalsIgnoreCase(earlyReturn)) {
					} else if ("null".equalsIgnoreCase(earlyReturn)) {
						if (Signature.SIG_BYTE.equals(typeSignature) || Signature.SIG_SHORT.equals(typeSignature)
								|| Signature.SIG_INT.equals(typeSignature) || Signature.SIG_LONG.equals(typeSignature)
								|| Signature.SIG_FLOAT.equals(typeSignature)
								|| Signature.SIG_DOUBLE.equals(typeSignature)
								|| Signature.SIG_CHAR.equals(typeSignature)
								|| Signature.SIG_BOOLEAN.equals(typeSignature)) {
							this.createMarker(type, annotation,
									"The value  \"null\" cannot be used with primitive types.");
						}
					} else if ("true".equalsIgnoreCase(earlyReturn) || "false".equalsIgnoreCase(earlyReturn)) {
						if (!Signature.SIG_BOOLEAN.equals(typeName)) {
							this.createMarker(type, annotation,
									"The method \"" + earlyReturn + "\" has to return a boolean value.");
						}
					} else if (('"' == earlyReturn.charAt(0))
							&& (earlyReturn.charAt(earlyReturn.length() - 1) == '"')) {
						var isString = false;
						for (final String[] entry : type.resolveType(typeName)) {
							if ("String".equals(entry[1]) && "java.lang".equals(entry[0])) {
								isString = true;
								break;
							}
						}
						if (!isString) {
							this.createMarker(type, annotation, "The \"java.lang.String\" value \"" + earlyReturn
									+ "\" is not compatible with the return type \"" + typeName + "\".");
						}
					} else {
						try {
							final var value = Integer.parseInt(earlyReturn);
							if (!Signature.SIG_INT.equals(typeSignature)
									&& (!Signature.SIG_BYTE.equals(typeSignature) || (-128 > value) || (value > 127))
									&& (!Signature.SIG_CHAR.equals(typeSignature) || (Character.MIN_VALUE > value)
											|| (value > Character.MAX_VALUE))) {
								this.createMarker(type, annotation, "The int value \"" + earlyReturn
										+ "\" is not compatible with the return type \"" + typeName + "\".");
							}
						} catch (final NumberFormatException e0) {
							try {
								final var value = Double.parseDouble(earlyReturn);
								if (!Signature.SIG_DOUBLE.equals(typeSignature)
										&& (!Signature.SIG_FLOAT.equals(typeSignature) || (Float.MIN_VALUE > value)
												|| (value > Float.MAX_VALUE))) {
									this.createMarker(type, annotation, "The double value \"" + earlyReturn
											+ "\" is not compatible with the return type \"" + typeName + "\".");
								}
							} catch (final NumberFormatException e1) {
								if (!this.isShort(type, annotation, earlyReturn, typeSignature, typeName)
										&& !this.isLong(type, annotation, earlyReturn, typeSignature, typeName)) {
									IMethod foundMethod = null;
									for (final IMethod m : type.getMethods()) {
										if (m.getElementName().equals(earlyReturn)) {
											foundMethod = m;
											if (m.getNumberOfParameters() != 0) {
												try {
													this.createMarker(type, annotation,
															"Only methods without parameters are allowed for as early return values.");
												} catch (final CoreException e) {
													e.printStackTrace();
												}
											}
										}
									}
									if ((foundMethod != null) && !typeName.toLowerCase().equals("void")) {
										var correctReturnType = false;
										typeName = this.replacePrimitiveWithObject(typeName);
										final var resolvedNeededTypes = type.resolveType(typeName);
										final var unresolvedReturnType = Signature
												.toString(foundMethod.getReturnType());
										if (!unresolvedReturnType.toLowerCase().contentEquals("void")) {
											final var resolvedReturnTypes = type
													.resolveType(this.replacePrimitiveWithObject(
															unresolvedReturnType));
											for (final String[] neededEntry : resolvedNeededTypes) {
												final var neededTypeSignature = neededEntry[0] + '.'
														+ neededEntry[1];
												for (final String[] returnEntry : resolvedReturnTypes) {
													final var returnTypes = new Stack<String>();
													returnTypes
															.add('Q' + returnEntry[0] + '.' + returnEntry[1] + ';');
													while (!returnTypes.isEmpty()) {
														final var pop = returnTypes.pop();
														final var returnTypeSignature = Signature.toString(pop)
																.replaceAll("<.*>", "");
														if (returnTypeSignature.equals(neededTypeSignature)) {
															correctReturnType = true;
															break;
														}
														final var returnType = type.getJavaProject()
																.findType(returnTypeSignature);
														final var superclassTypeSignature = returnType
																.getSuperclassTypeSignature();
														if (superclassTypeSignature != null) {
															returnTypes.add(superclassTypeSignature);
														} else {
															returnTypes.add("Ljava.lang.Object;");
														}
														Collections.addAll(returnTypes, returnType
																.getSuperInterfaceTypeSignatures());
													}
													if (correctReturnType) {
														break;
													}
												}
												if (correctReturnType) {
													break;
												}
											}
										}
										if (!correctReturnType) {
											this.createMarker(type, annotation, "The method \"" + earlyReturn
													+ "\" has to return an instance of \"" + typeName + "\".");
										}
									} else {
										try {
											this.createMarker(type, annotation, "There is no method with the name \""
													+ earlyReturn + "\" in this class.");
										} catch (final CoreException e) {
											e.printStackTrace();
										}
									}
								}
							}
						}
					}
				}

			} catch (final JavaModelException e) {
				e.printStackTrace();
			} catch (final CoreException e) {
				e.printStackTrace();
			}
		}
	}

	private String getTypeSignature(final IAnnotation annotation) throws JavaModelException {
		final var parent = annotation.getParent();
		if (parent.getElementType() == IJavaElement.METHOD) {
			return ((IMethod) parent).getReturnType();
		}
		if (parent.getElementType() == IJavaElement.FIELD) {
			return ((IField) parent).getTypeSignature();
		}
		throw new RuntimeException();
	}

	private String getEarlyReturn(final String fullyQualifiedName, final IAnnotation annotation)
			throws JavaModelException {
		if (fullyQualifiedName.equals(Secrecy.class.getName())
				|| fullyQualifiedName.equals(Integrity.class.getName())) {
			final var pairs = annotation.getMemberValuePairs();
			if (pairs.length != 0) {
				for (final IMemberValuePair pair : pairs) {
					if (pair.getMemberName().equals("earlyReturn")) {
						return ((String) pair.getValue()).trim();

					}
				}
			}
		}
		return null;
	}

	private boolean isLong(final IType type, final IAnnotation annotation, final String earlyReturn,
			final String typeSignature,
			final String typeName) {

		try {
			final var last = earlyReturn.charAt(earlyReturn.length() - 1);
			if ((last == 'l') || (last == 'L')) {
				Long.parseLong(earlyReturn.substring(0, earlyReturn.length() - 1));
				if (!Signature.SIG_LONG.equals(typeSignature)) {
					this.createMarker(type, annotation, "The long value \"" + earlyReturn
							+ "\" is not compatible with the return type \"" + typeName + "\".");
				}
				return true;
			}
		} catch (final NumberFormatException e) {
			e.printStackTrace();
		} catch (final CoreException e1) {
			e1.printStackTrace();
		}
		return false;
	}

	private boolean isShort(final IType type, final IAnnotation annotation, final String earlyReturn,
			final String typeSignature,
			final String typeName) {

		try {
			final long value = Short.parseShort(earlyReturn);
			if (!Signature.SIG_SHORT.equals(typeSignature)) {
				this.createMarker(type, annotation, "The short value \"" + earlyReturn
						+ "\" is not compatible with the return type \"" + typeName + "\".");
			}
			return true;
		} catch (final NumberFormatException e) {
		} catch (final JavaModelException e) {
			e.printStackTrace();
		} catch (final CoreException e) {
			e.printStackTrace();
		}
		return false;
	}

	private void createMarker(final IType type, final IAnnotation annotation, final String message)
			throws CoreException, JavaModelException {
		final var marker = type.getResource().createMarker("org.gravity.carisma.rt.markers");
		marker.setAttribute(IMarker.MESSAGE, message);
		final var offset = annotation.getNameRange().getOffset();
		marker.setAttribute(IMarker.SEVERITY, IMarker.SEVERITY_ERROR);
		final var line = type.getCompilationUnit().getSource().substring(0, offset).chars()
				.filter(w -> ((w == '\n') || (w == '\r'))).count();
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
