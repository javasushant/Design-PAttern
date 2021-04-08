package com.nt.test1;

import com.nt.sdp.Printer1;

public class TicketBookingService implements Runnable {

	@Override
	public void run() {
		try {
			Printer1 p1=Printer1.getInstance();
			System.out.println(p1.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
