package main;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import org.gravity.typegraph.basic.BasicPackage;
import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TypeGraph;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		rs.getPackageRegistry().put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		TypeGraph pm = (TypeGraph) rs.getResource(URI.createURI("pm.xmi"), true).getContents().get(0);

		EList<TAbstractType> types = pm.getAllTypes();
		Object[] ids = types.parallelStream().filter(t -> !t.isTLib()).flatMap(t -> t.getDefines().parallelStream())
				.filter(TMethodDefinition.class::isInstance)
				.map(m -> {
					String type = m.getDefinedBy().getTName();
					if(type.contains("$")) type = "*";
					return type + "."
							+ ((TMethodSignature) m.getSignature()).getMethod().getTName() + "(*)";
				})
				.toArray();

		try (PrintStream out = new PrintStream("methods-larva")) {
			for (int i = 0; i < ids.length; i++) {
				String id = (String) ids[i];
				out.println("enterM" + i + "(String id) = {" + id + "} where id = \"" + id + "\";");
				out.println("exitM" + i + "() = {" + id + "uponReturning(*)}");
			}
			out.print("enterMethod() = {enterM0");
			for (int i = 1; i < ids.length; i++) {
				out.print("|enterM" + i);
			}
			out.println("}");
			out.print("exitMethod() = {exitM0");
			for (int i = 1; i < ids.length; i++) {
				out.print("|exitM" + i);
			}
			out.println("}");
		}
	}

}
