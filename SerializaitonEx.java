package com.akhil.basic;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializaitonEx implements Serializable {
	private static final long serialVersionUID = -931800629094762462L;
	private String name;
	private int age;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public SerializaitonEx(String name, int age) {
		this.name = name;
		this.age = age;

	}
	public void message(){
		System.out.println("normal message");
	}

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		SerializaitonEx se = new SerializaitonEx("Akhielsh", 23);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"serilizble.ser"));
		oos.writeObject(se);
		oos.close();

	}

}
