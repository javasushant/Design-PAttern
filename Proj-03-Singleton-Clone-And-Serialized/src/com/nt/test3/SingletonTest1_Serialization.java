package com.nt.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printer1;
import com.nt.sdp.Printer3;

public class SingletonTest1_Serialization {

	public static void main(String[] args) {
		try {
			//get singleton java class object
			Printer3 p1= Printer3.getInstance();
			//write Object data file using ObjectOutputStream support(Serialization process)
			ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("printer_data1.ser"));
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
