package cwe;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import example.ClassWithSecretData;

public class CWE499 {

	public static void main(String[] args) {
		ClassWithSecretData clazz = new ClassWithSecretData();
		clazz.setPassword("SecretPassword");
		clazz.printSecret();
		
		File file = new File("secret.txt");
		try (FileOutputStream fileOut = new FileOutputStream(file);
			ObjectOutputStream out = new ObjectOutputStream(fileOut)){
			out.writeObject(clazz);;
			System.out.println("Serialized data is saved in: "+file.getAbsolutePath());
		} catch (IOException i) {
			i.printStackTrace();
		}

		try(FileInputStream fileIn = new FileInputStream(file);
				ObjectInputStream in = new ObjectInputStream(fileIn)){
			ClassWithSecretData clone = (ClassWithSecretData) in.readObject();
			clone.printSecret();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
