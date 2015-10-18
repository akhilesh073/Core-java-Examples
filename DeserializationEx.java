package com.akhil.basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"serilizble.ser"));
		
		SerializaitonEx se=(SerializaitonEx)ois.readObject();
		System.out.println("Name: "+se.getName());
		System.out.println("Age: "+ se.getAge());
		se.message();
		ois.close();
	}

}
