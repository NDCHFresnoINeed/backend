package com.ndch.ineed;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.Named;

@Api(name="providerinterface", version = "v1")
public class ProviderInterface {
	
	public static ArrayList<Provider> Items = new ArrayList<Provider>();

	final static ServiceHour serviceHour = new ServiceHour("1", "2");
	
	final static Map<String, ServiceHour> hours = new HashMap<String, ServiceHour>(); 
	
	
	private static void setHours() {
		hours.put("Monday", serviceHour);
		hours.put("Tuesday", serviceHour);
	}
	
	static {
		
		setHours();
		
		Items.add(new Provider()
		.setLocation(new Location("123 Blah","Fresno", "93277"))
		.setName("BlahLand")
		.setPhoneNumber("1234567890")
		.setServiceHours(hours));
	}

	public Provider getString(@Named("id") Integer id) {
		
		return Items.get(id);
	}
}
