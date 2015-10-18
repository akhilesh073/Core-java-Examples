package com.akh.collection.hashMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapSortingKeyAndValue {
	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(10, "X");
		hmap.put(32, "B");
		hmap.put(27, "A");
		hmap.put(13, "C");
		hmap.put(41, "D");
		System.out.println("Before Sorting");
		System.out.println("==================");
		display(hmap);
		Map<Integer, String> map1 = new TreeMap<Integer, String>(hmap);
		System.out.println("After Sorting Key");
		System.out.println("====================");
		display(map1);
		Map<Integer, String> map2 = sortByValues(hmap);
		System.out.println("After  Value:");
		System.out.println("====================");
		display(map2);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Map<Integer, String> sortByValues(Map<Integer, String> hmap) {
		List list = new LinkedList(hmap.entrySet());
		// Defined Custom Comparator here
		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry) (o1)).getValue())
						.compareTo(((Map.Entry) (o2)).getValue());
			}
		});

		// Here I am copying the sorted list in HashMap
		// using LinkedHashMap to preserve the insertion order
		HashMap sortedHashMap = new LinkedHashMap();
		for (Iterator it = list.iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
		}
		return sortedHashMap;
	}

	@SuppressWarnings("rawtypes")
	private static void display(Map<Integer, String> hmap) {
		Set s = hmap.entrySet();
		Iterator it = s.iterator();
		while (it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + " : " + me.getValue());

		}
	}
}
