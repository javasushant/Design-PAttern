package com.nt.test1;

import com.nt.sdp.Printer1;

public class SingleTonTest {

	public static void main(String[] args) {
	try {
		Printer1 p1=Printer1.getInstance();
		Printer1 p2=Printer1.getInstance();
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2  -->  "+(p1==p2));
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
