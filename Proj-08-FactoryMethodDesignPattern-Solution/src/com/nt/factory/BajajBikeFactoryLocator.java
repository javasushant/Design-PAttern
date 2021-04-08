package com.nt.factory;

import com.nt.comp.BajajBike;

public class BajajBikeFactoryLocator {
	//just factory pattern
	public static BajajBikeFactory buildBikeFactory(String locator) {
		if(locator.equalsIgnoreCase("chennai"))
		return new BajajChennaiFactory();
		else if(locator.equalsIgnoreCase("noida"))
			return new BajajNoidaFactory();
		else
			throw new IllegalArgumentException("invalid location");
	}
}
