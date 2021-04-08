package com.nt.test;

import com.nt.sdp.Printer;

public class TicketBookingService implements Runnable {

	@Override
	public void run() {
		Printer p1;
		try {
			p1 = Printer.getInstance();
			System.out.println(p1.hashCode());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
