package com.nt.test3;

import com.nt.sdp.Printer1;
import com.nt.sdp.Printer3;

public class TicketBookingService implements Runnable {

	@Override
	public void run() {
		try {
			Printer3 p1=Printer3.getInstance();
			System.out.println(p1.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
