package com.nt.factory;

import com.nt.comp.HireDotNetFresher;
import com.nt.comp.HireFrsher;
import com.nt.comp.HireJavaFresher;
import com.nt.comp.HireUIFresher;

public class HireFresherFactory {
	
	public static HireFrsher getInstance(String fresherType) {
		if(fresherType.equalsIgnoreCase("java"))
			return new HireJavaFresher();
		else if(fresherType.equalsIgnoreCase("ui"))
			return new HireUIFresher();
		else if(fresherType.equalsIgnoreCase("dotNet"))
			return new HireDotNetFresher();
		else
			throw new IllegalArgumentException("As of now we not recruiting Frsher : "+fresherType);
	}
}
