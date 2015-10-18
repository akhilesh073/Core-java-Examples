package com.akh.StringEx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicateArray {
	/**
	 * To check whether a string array contains an duplicate element
	 */
	public static void main(String[] args) {
		String[] str = { "Akhilesh", "Sandeep", "Amit", "Abhinav", "Nikhil",
				"Akhilesh" };
		System.out.println(bruteforce(str));
		System.out.println(usingListAndSet(str));
		System.out.println(checkDuplicateUsingAdd(str));
	}

	private static boolean bruteforce(String[] str) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str.length; j++) {
				if (str[i].equals(str[j]) && i != j) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean usingListAndSet(String[] str) {
		List<String> li = Arrays.asList(str);
		Set<String> set = new HashSet<String>(li);
		if (set.size() < li.size()) {
			return true;
		}
		return false;
	}

	public static boolean checkDuplicateUsingAdd(String[] input) {
		Set<String> tempSet = new HashSet<String>();
		for (String str : input) {
			if (!tempSet.add(str)) {
				return true;
			}
		}
		return false;
	}
}
