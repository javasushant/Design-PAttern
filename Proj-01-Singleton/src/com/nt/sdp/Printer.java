package com.nt.sdp;

public class Printer {
	//Type
	private static Printer INSTANCE;
	//private static Printer INSTANCE=new Printer(); //eager instantiation
	//private constructor
	private Printer() {
		System.out.println("Printer.0-param-constructor");
	}//constructor
	
	/*
	  //static factory method 
	  public static Printer getInstance()  {
	   //singleton logic
	   if(INSTANCE==null)
	  
	   	INSTANCE=new Printer(); 
	   return INSTANCE; 
	   }//method
	  /*
	   * 
	   */
	/*
	  //static factory method 
	  public synchronized static Printer getInstance()  {
		  //singleton logic
		  if(INSTANCE==null)
			  
			  INSTANCE=new Printer(); 
		  return INSTANCE; 
	  }//method
	  */
	  //static factory method 
	  public  static Printer getInstance()  {
		  if(INSTANCE==null) //1st null check
		  synchronized (Printer.class) {
			  //singleton logic
			  if(INSTANCE==null) //2nd null check
				  
				  INSTANCE=new Printer(); 
		}
		 
		  return INSTANCE; 
	  }//method
	
	/* 
	public static Printer getInstance()  {
		  return INSTANCE;
	  }
	  */
	public void print(String msg) {
		System.out.println(msg);
	}
}
