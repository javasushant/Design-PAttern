//package com.nt.test3;
//
//import com.nt.sdp.Printer1;
//import com.nt.sdp.Printer3;
//
//public class SingleTonTest1_ClonableTest {
//
//	public static void main(String[] args) throws CloneNotSupportedException {
//		//create thread having servlet class obj as data
//		Printer3 p1=Printer3.getInstance();
//		try {
//			Printer3 p2=(Printer3) p1.clone();
//			System.out.println("Object has cloned ");
//			System.out.println("Hascode   "+p1.hashCode()+"  "+p2.hashCode());
//			System.out.println("p1==p2" +(p1==p2));
//		} 
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//	}//main
//}//class
////