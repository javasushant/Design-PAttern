package com.nt.test1;

import com.nt.sdp.Printer1;

public class SingleTonTest1_ClonableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		//create thread having servlet class obj as data
		Printer1 p1=Printer1.getInstance();
		try {
			Printer1 p2=(Printer1) p1.clone();
			System.out.println("Object has cloned ");
			System.out.println("Hascode   "+p1.hashCode()+"  "+p2.hashCode());
			System.out.println("p1==p2" +(p1==p2));
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
