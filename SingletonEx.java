package com.akh.ThreadEx;

import java.io.ObjectStreamException;
import java.util.ArrayList;

public class SingletonEx implements Cloneable {
	
	/*
	 * singleton means only one object will be created for the class. use: if
	 * there is only one license for database connection, then by singleton will
	 * make sure that only one connection is made or only one thread can access
	 * the connection at a time.
	 */

	// This can be achieved by making the constructor of the class as private
	// so that we can't create object outside the class.
	private static SingletonEx myobj;

	private SingletonEx() {

	}

	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();

	}

	public static SingletonEx getInstance() {

		if (myobj == null) {
			synchronized (SingletonEx.class) {

				if (myobj == null) {
					System.out.println("came here to create an object...");
					myobj = new SingletonEx();
				}

			}
		}

		return myobj;
	}

	private Object readResolve() throws ObjectStreamException {
		return myobj;
	}

	public void showInfo() {

		System.out.println("Created only one object...");
	}

	public static void main(String[] args) {
		SingletonEx st = SingletonEx.getInstance();
		Class<SingletonEx> cls=SingletonEx.class;
		cls.getDeclaredConstructors();
		st.showInfo();
		

	}

}
