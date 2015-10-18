package com.akh.StringEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class DeleteDuplicateList {

	public static void main(String[] args) {
		String[] arr = { "Android", "java", "C++", "c", "oracle", "java" };
		List<String> duplicateList = (List<String>) Arrays.asList(arr);
		System.out.println("list size: " + duplicateList.size());
		System.out.println(duplicateList);

		// to remove duplicate element pass it to hashset. i.e. convert
		// arraylist to Hashset

		HashSet<String> listToSet = new HashSet<String>(duplicateList);
		// Again pass this set to list to create the new arraylist without
		// duplicate

		List<String> listWithoutDuplicate = new ArrayList<String>(listToSet);
		System.out.println("final list size: " + listWithoutDuplicate.size());
		System.out.println(listWithoutDuplicate);

		// with linkeHashSet without losing insertion order

		HashSet<String> linkedHashSet = new LinkedHashSet<String>(duplicateList);
		List<String> listWithoutDuplicate1 = new ArrayList<String>(
				linkedHashSet);
		System.out.println("final list size: " + listWithoutDuplicate1.size());
		System.out.println(listWithoutDuplicate1);
	}

}
