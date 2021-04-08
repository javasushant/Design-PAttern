package com.nt.test3;

import com.nt.sdp.Printer1;
import com.nt.sdp.Printer3;

public class SingleTonTest {

	public static void main(String[] args) {
	try {
		Printer3 p1=Printer3.getInstance();
		Printer3 p2=Printer3.getInstance();
		System.out.println(p1.hashCode()+" "+p2.hashCode());
		System.out.println("p1==p2  -->  "+(p1==p2));
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
