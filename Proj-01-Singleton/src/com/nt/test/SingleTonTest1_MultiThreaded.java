package com.nt.test;

public class SingleTonTest1_MultiThreaded {

	public static void main(String[] args) {
		//create thread having servlet class obj as data
		TicketBookingService servlet= new TicketBookingService();
		Thread t1= new Thread(servlet);
		Thread t2= new Thread(servlet);
		Thread t3= new Thread(servlet);
		
		t1.start();
		t2.start();
		t3.start();
	}//main
}//class
