package com.ndch.ineed;

public class Location {
	private String street;
	private String city;
	private String zipcode;
	
	public Location (final String street, final String city, final String zipcode) {
		setCity(city);
		setStreet(street);
		setZipcode(zipcode);
	}
	
	public String getStreet() {
		return street;
	}
	public Location setStreet(String street) {
		this.street = street;
		return this;
	}
	public String getCity() {
		return city;
	}
	public Location setCity(String city) {
		this.city = city;
		return this;
	}
	public String getZipcode() {
		return zipcode;
	}
	public Location setZipcode(String zipcode) {
		this.zipcode = zipcode;
		return this;
	}

}
