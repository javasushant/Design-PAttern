package com.nt.test;

import com.nt.comp.HireFrsher;
import com.nt.comp.HireJavaFresher;
import com.nt.factory.HireFresherFactory;

public class NareshITPlacementDept {

	public static void main(String[] args) {
		HireFrsher uiFrsher=HireFresherFactory.getInstance("ui");
		boolean result=uiFrsher.recruitFresher();
		if(result)
			System.out.println("UI Fresher is selected");
    	else
    		System.out.println("UI Fresher is not selected");
	}

}
