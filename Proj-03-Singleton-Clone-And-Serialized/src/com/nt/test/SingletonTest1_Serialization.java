package com.nt.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printer;

public class SingletonTest1_Serialization {

	public static void main(String[] args) {
		try {
			//get singleton java class object
			Printer p1= Printer.getInstance();
			//write Object data file using ObjectOutputStream support(Serialization process)
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
			oos.writeObject(p1);
			oos.flush();
			oos.close();
			System.out.println("Serialization is Done");
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main
}//class
