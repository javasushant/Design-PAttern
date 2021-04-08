package com.nt.test;

import com.nt.comp.BajajBike;
import com.nt.factory.BajajChennaiFactory;
import com.nt.factory.BajajNoidaFactory;

public class SouthCustomer {

	public static void main(String[] args) {
		BajajBike bike=BajajChennaiFactory.createBike("platina");
		bike.drive();
	}

}
