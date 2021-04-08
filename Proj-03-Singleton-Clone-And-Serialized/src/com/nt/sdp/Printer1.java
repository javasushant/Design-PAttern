package com.nt.sdp;

import com.nt.commons.CommonsUtils;

public class Printer1 extends CommonsUtils {
	private   static volatile Printer1 INSTANCE;
	
	private Printer1() {
		if(INSTANCE!=null)
			throw new RuntimeException("Object is already created");
		System.out.println("Printer1.0-param-constructor");
	}//constructor
	
	
	
	//static factory method 
	  public  static Printer1 getInstance() {
		  if(INSTANCE==null) { //1st null check
			  synchronized (Printer1.class) {
				  //write Singleton logic
				  if(INSTANCE==null) //2nd null check
					  INSTANCE=new Printer1();
			}
		  }
		  return INSTANCE;
	  }
	  private static  final long serialVersionUID=5354353L;
	  public Object clone() throws CloneNotSupportedException {
		  throw new CloneNotSupportedException("Cloninfg not allowed in singleton class");
		  //return InnerPrinter1.INSTANCE;
	  }
	  private Object readResolve() {
		  return INSTANCE;
	}
	public void print(String msg) {
		System.out.println(msg);
	}
}
