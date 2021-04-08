package com.nt.test;

import com.nt.comp.HireFrsher;
import com.nt.comp.HireUIFresher;
import com.nt.factory.HireFresherFactory;

public class NacreITPlacementDept {

	public static void main(String[] args) {
		 HireFrsher javaFresher=HireFresherFactory.getInstance("java");
		boolean result= javaFresher.recruitFresher();
		if(result)
			System.out.println("JAVA Fresher is selected");
    	else
    		System.out.println("JAVA Fresher is not selected");
		
	}

}
