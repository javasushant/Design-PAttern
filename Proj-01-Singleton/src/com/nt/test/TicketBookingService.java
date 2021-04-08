package com.nt.test;

import com.nt.sdp.Printer;

public class TicketBookingService implements Runnable {

	@Override
	public void run() {
		Printer p1=Printer.getInstance();
		System.out.println(p1.hashCode());
		
	}
	
}
