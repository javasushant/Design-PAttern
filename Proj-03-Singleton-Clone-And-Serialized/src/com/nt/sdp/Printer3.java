package com.nt.sdp;

import com.nt.commons.CommonsUtils;

public enum Printer3 {
	INSTANCE; // internally gives INSTANCE =new Printer3();
	
	
	//static factory method 
	  public  static Printer3 getInstance() {
		  return INSTANCE;
	  }
	  
	
	public void print(String msg) {
		System.out.println(msg);
	}
}
