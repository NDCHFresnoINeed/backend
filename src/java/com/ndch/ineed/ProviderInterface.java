package com.ndch.ineed;

import java.util.ArrayList;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.Named;

@Api(name="providerinterface", version = "v1")
public class ProviderInterface {
	
	public static ArrayList<Provider> Items = new ArrayList<Provider>();

	static {
		Items.add(new Provider());
//		Items.add(new Pantry("Bye"));
	}

	public Provider getString(@Named("id") Integer id) {
		return Items.get(id);
	}
}
