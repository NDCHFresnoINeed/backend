package com.ndch.ineed;

public class Category {
	private String type;
	private ServiceHour serviceHour;
	private Location location;
	
	public Category (final String type, final ServiceHour serviceHour, final Location location) {
		setLocation(location);
		setServiceHour(serviceHour);
		setType(type);
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public ServiceHour getServiceHour() {
		return serviceHour;
	}
	public void setServiceHour(ServiceHour serviceHour) {
		this.serviceHour = serviceHour;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

}
