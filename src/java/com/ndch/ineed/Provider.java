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

	public Provider setLocation(Location location) {
		this.location = location;
		return this;
	}

	public String getName() {
		return name;
	}

	public Provider setName(String name) {
		this.name = name;
		return this;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public Provider setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Map <String, ServiceHour> getServiceHours() {
		return serviceHours;
	}

	public Provider setServiceHours(Map <String, ServiceHour> serviceHours) {
		this.serviceHours = serviceHours;
		return this;
	}
}

