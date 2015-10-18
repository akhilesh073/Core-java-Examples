package com.akh.ObjectCreationEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectCreationFinal implements Cloneable, Serializable {
	String text = "object created";

	private static final long serialVersionUID = 1L;

	public ObjectCreationFinal() {
		System.out.println("Hello! ObjectCreationFinal() just got created..");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (ObjectCreationFinal) super.clone();
	}

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws Exception {

		try {
			// Create Object1 using new keyword
			System.out.println("obj1");
			ObjectCreationFinal object1 = new ObjectCreationFinal();

			// Create Object2 using clas.forname().newInstance()
			System.out.println("obj2");
			ObjectCreationFinal object2 = (ObjectCreationFinal) Class.forName(
					"com.akh.ObjectCreationEx.ObjectCreationFinal")
					.newInstance();

			// Create Object3 using clone method
			System.out.println("obj3");
			ObjectCreationFinal secondObject = new ObjectCreationFinal();
			ObjectCreationFinal object3 = (ObjectCreationFinal) secondObject
					.clone();

			// Create Object4 using classloader.getCkassLoader().loadClass().newInstance()
			System.out.println("obj4");
			Object object4 = ObjectCreationFinal.class.getClassLoader()
					.loadClass("com.akh.ObjectCreationEx.ObjectCreationFinal")
					.newInstance();

			// Create Object5 using serialization and deserialization
			// create a new file with an ObjectOutputStream
			System.out.println("obj5");
			FileOutputStream out = new FileOutputStream(
					"ObjectCreationFinal.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);

			// write something in the file
			oout.writeObject(object3);
			oout.flush();

			// create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"ObjectCreationFinal.txt"));
			ObjectCreationFinal object5 = (ObjectCreationFinal) ois
					.readObject();
			System.out.println(object5.text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}