package com.nt.test3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.nt.sdp.Printer3;

public class SingletonTest2_DeSerialization {

	public static void main(String[] args) {
		Printer3  p1=Printer3.getInstance();
		   System.out.println(p1.hashCode());
		try {
		//Recieve Object having data colllected from the file using Deserialized process
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("printer_data1.ser"));
		//get Printer obj
		Printer3 p2=(Printer3) ois.readObject();
		p2.print("Hello");
		System.out.println("p2 object hashCode : "+p2.hashCode());
		ois.close();
		System.out.println("Object Deserialized is done");
		
		System.out.println("-----------------------------");
		
		//Recieve Object having data colllected from the file using Deserialized process
		ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("printer_data.ser"));
		//get Printer obj
		Printer3 p3=(Printer3) ois1.readObject();
		p3.print("Hello");
		System.out.println("p3 object hashCode : "+p3.hashCode());
		ois1.close();
		System.out.println("Object Deserialized is done");
		
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
