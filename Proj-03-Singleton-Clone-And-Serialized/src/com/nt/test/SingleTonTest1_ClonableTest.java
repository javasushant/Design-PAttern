package com.nt.test;

import com.nt.sdp.Printer;

public class SingleTonTest1_ClonableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		//create thread having servlet class obj as data
		Printer p1=Printer.getInstance();
		try {
			Printer p2=(Printer) p1.clone();
			System.out.println("Object has cloned ");
			System.out.println("Hascode   "+p1.hashCode()+"  "+p2.hashCode());
			System.out.println("p1==p2" +(p1==p2));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
