package com.nt.test1;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer;
import com.nt.sdp.Printer1;

public class SingletonTest1_ReflectionAPI {

	public static void main(String[] args) {
		//get singleton object of single java class using static factory method
		
		try {
			Printer1 p1= Printer1.getInstance();
			//get java.lang.Class Object representing Printer class
			Class c =p1.getClass();//getClass() is public method of java.lang.class object
			//get All constructor of Printer class
			Constructor cons[] = c.getDeclaredConstructors();
			cons[0].setAccessible(true); //gives acess to private constructor
			//create object using the accessed private constructor
			Printer1 p2=(Printer1) cons[0].newInstance();
			Printer1 p3=(Printer1) cons[0].newInstance();
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
