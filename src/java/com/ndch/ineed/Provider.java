package com.ndch.ineed;

import java.util.Map;

public class Provider {
	private String name;
	private Location location;
	private String phoneNumber;
	private Map <String, ServiceHour> serviceHours;
	
	
	
	public Location getLocation() {
		return location;
	}



	public void setLocation(Location location) {
		this.location = location;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getPhoneNumber() {
		return phoneNumber;
	}



	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	public Map <String, ServiceHour> getServiceHours() {
		return serviceHours;
	}



	public void setServiceHours(Map <String, ServiceHour> serviceHours) {
		this.serviceHours = serviceHours;
	}


}
