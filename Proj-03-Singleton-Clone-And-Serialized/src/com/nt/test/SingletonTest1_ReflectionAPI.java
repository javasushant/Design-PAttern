package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer;

public class SingletonTest1_ReflectionAPI {

	public static void main(String[] args) {
		//get singleton object of single java class using static factory method
		
		try {
			Printer p1= Printer.getInstance();
			//get java.lang.Class Object representing Printer class
			Class c =p1.getClass();//getClass() is public method of java.lang.class object
			//get All constructor of Printer class
			Constructor cons[] = c.getDeclaredConstructors();
			cons[0].setAccessible(true); //gives acess to private constructor
			//create object using the accessed private constructor
			Printer p2=(Printer) cons[0].newInstance();
			Printer p3=(Printer) cons[0].newInstance();
			System.out.println("Object are created using Reflection API");
			System.out.println(p1.hashCode()+" "+p2.hashCode()+" "+p3.hashCode());
		}//try
		catch(InstantiationException ie) {
			ie.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
