package com.akh.collection.hashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {
	public static void main(String[] args) {
		Country indiaCountry = new Country(1, "India");
		Country australiaCountry = new Country(4, "Australia");
		Country pakistanCountry = new Country(3, "pakistan");
		Country srilankaCountry = new Country(2, "Srilanka");
		List<Country> listOfCountries = new ArrayList<Country>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(australiaCountry);
		listOfCountries.add(pakistanCountry);
		listOfCountries.add(srilankaCountry);
		System.out.println("Before sort:");
		System.out.println("===============");
		for (Country cont : listOfCountries) {
			System.out.println(cont.getCountryId() + " === " + cont.getCountryName());
		}
		Collections.sort(listOfCountries);
		System.out.println("After sort:");
		System.out.println("============");
		for (Country cont : listOfCountries) {
			System.out.println(cont.getCountryId() + " === " + cont.getCountryName());
		}
	}
}
