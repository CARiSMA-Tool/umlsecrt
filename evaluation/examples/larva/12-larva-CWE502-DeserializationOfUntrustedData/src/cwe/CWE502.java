package cwe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CWE502 {

//	@Secrecy@Integrity
	private static String secret = "SECRET";
	
	
	private static final Path evilObjFileSrc = Paths.get("evil/evil.obj");
	private static final Path evilClassFileSrc = Paths.get("evil/evil/EvilSerializeableClass.class");

	private static final File objFile = new File("serializedClass.obj");

	public static void main(String[] args) {
		try {
			if (!CWE502.objFile.exists()) {
				CWE502.objFile.createNewFile();
			}
			SerializableClass obj = new SerializableClass();
			System.out.println("Serialize object:\n\tobj=" + obj);
			System.out.println("\tlocation="+objFile);
			try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(CWE502.objFile))) {
				stream.writeObject(obj);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nLoad object:\n\tfrom="+objFile);
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(objFile))) {
			SerializableClass obj = (SerializableClass) in.readObject();
			System.out.println("\tobj="+obj);
			System.out.println("\tcall=obj.doSomething(new CWE502());");
			obj.doSomething(new CWE502());
		} catch (IOException | ClassNotFoundException | IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println("\n Replace serialized file and add class to cp");
		File folder = new File("bin/evil");
		File evilClassFileTrg = new File(folder, "EvilSerializeableClass.class");
		try {
			folder.mkdirs();
			System.out.println("\t copy "+evilClassFileSrc+" --> "+evilClassFileTrg);
			Files.copy(evilClassFileSrc, new FileOutputStream(evilClassFileTrg));
			System.out.println("\t copy "+evilObjFileSrc+" --> "+objFile);
			Files.copy(evilObjFileSrc, new FileOutputStream(objFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nLoad object:\n\tform="+objFile);
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(objFile))) {
			SerializableClass obj = (SerializableClass) in.readObject();
			System.out.println("\tobj="+obj);
			System.out.println("\tcall=obj.doSomething(new CWE502());");
			obj.doSomething(new CWE502());
		} catch (IOException | ClassNotFoundException | IllegalArgumentException | SecurityException e) {
			e.printStackTrace();
		}
		System.out.println("\nCleanup");
		System.out.println("\t delete: "+evilClassFileTrg);
		evilClassFileTrg.delete();
		System.out.println("\t delete: "+objFile);
		objFile.delete();
		System.out.println("\nDone");
	}

	public void api() {
		System.out.println("API");
	}

//	@Secrecy
	public void secret() {
		System.out.println(secret);	
	}
	
//	@Integrity
	public void setSecret(String secret) {
		this.secret = secret;
		System.out.println("Changed secret to: "+this.secret);
	}
}
