package com.akh.StringEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("Akhilesh");
		al.add("Sandeep");
		al.add("Amit");
		al.add("Nikhil");
		al.add("Abhinav");
		System.out.println("First way using for-each loop");
		System.out.println("=================");
		for (String lst : al) {
			System.out.println(lst);
		}

		System.out.println("Second way using general for loop");
		System.out.println("=================");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("Third way using Iterator");
		System.out.println("=================");
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
