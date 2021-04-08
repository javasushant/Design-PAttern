package com.nt.test;

import com.nt.sdp.Printer;

public class TicketBookingService implements Runnable {

	@Override
	public void run() {
		try {
			Printer p1=Printer.getInstance();
			System.out.println(p1.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
