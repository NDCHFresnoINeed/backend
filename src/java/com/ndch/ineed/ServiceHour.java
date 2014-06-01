package com.ndch.ineed;

//import java.util.Date;

public class ServiceHour {
	private String openingHour;
	private String closingHour;
	
	public ServiceHour (final String openingHour, final String closingHour) {
		setOpeningHour(openingHour);
		setClosingHour(closingHour);
	}
	
	public String getOpeningHour() {
		return openingHour;
	}
	public String getClosingHour() {
		return closingHour;
	}
	public void setOpeningHour(String openingHour) {
		this.openingHour = openingHour;
	}
	public void setClosingHour(String closingHour) {
		this.closingHour = closingHour;
	}
}
