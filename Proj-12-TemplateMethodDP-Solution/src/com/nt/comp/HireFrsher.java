package com.nt.comp;

public abstract class HireFrsher {
	public boolean conductApttitudeTest() {
		System.out.println("Conducting Aptitude Test for Fresher");
		return true;
	}
	 public boolean conductGDTest() {
	  	  System.out.println("Conducting GD Test for Fresher");
	  	  return true;
	  }
	 public abstract boolean conductTechnicalTest();
	 public abstract boolean conductCodingTest();
	 
	 public boolean conductHRTest() {
   	  System.out.println("Conducting HR Test for Fresher");
   	  return true;
   }
	 
	 //Template method defining the skelton of algorithm
	 public boolean recruitFresher() {
		 System.out.println("HireFresher.recruiteFresher alogirthem exuection is started");
		 if(conductApttitudeTest())
			 if(conductGDTest())
				 if(conductTechnicalTest())
					 if(conductCodingTest())
						 if(conductHRTest())
							 return true;
		 return false;
	 }
}
