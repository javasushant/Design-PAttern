package com.nt.sdp;

import com.nt.commons.CommonsUtils;

public class Printer extends CommonsUtils {
	
	private Printer() {
		System.out.println("Printer.0-param-constructor");
	}//constructor
	
	private static class InnerPrinter {
		private  volatile static Printer INSTANCE = new Printer();
	}
	//static factory method 
	  public  static Printer getInstance() throws CloneNotSupportedException  {
//		  throw new CloneNotSupportedException("Cloninfg not allowed in singleton class");
		  return InnerPrinter.INSTANCE;
	  }
	  
	  public Object clone() {
		  return InnerPrinter.INSTANCE;
	  }
	public void print(String msg) {
		System.out.println(msg);
	}
}
