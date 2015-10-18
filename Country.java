package com.akh.collection.hashMap;

public class Country implements Comparable<Object>{

	private int countryId;
	private String countryName;
	public Country(int id,String name){
		countryId=id;
		countryName=name;
	}
	
	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public int compareTo(Object obj) {
		Country country=(Country)obj;
		
		return (this.countryId < country.countryId) ? -1 : (this.countryId > country.countryId) ? 1:0;
	}
	

}
