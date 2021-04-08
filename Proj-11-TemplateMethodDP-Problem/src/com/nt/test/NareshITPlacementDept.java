package com.nt.test;

import com.nt.comp.HireFrsher;
import com.nt.comp.HireJavaFresher;

public class NareshITPlacementDept {

	public static void main(String[] args) {
		HireFrsher javaFresher=new HireJavaFresher();
		boolean result=javaFresher.conductApttitudeTest();
		if(result)
			result=javaFresher.conductGDTest();
		if(result)
			result=javaFresher.conductTechnicalTest();
		if(result)
			result=javaFresher.conductCodingTest();
		if(result)
			result=javaFresher.conductHRTest();
		if(result)
			System.out.println("Java Fresher is Selected");
		else
			System.out.println("Java Fresher is not selected");
	}

}
