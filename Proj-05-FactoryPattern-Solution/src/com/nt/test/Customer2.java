package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.CarTyres;
import com.nt.comp.SwiftCar;
import com.nt.factory.CarFactory;
import com.nt.factory.CarType;

public class Customer2 {

	public static void main(String[] args) {
		Car car=CarFactory.getCar(CarType.SWIFT);
		System.out.println(car);
	}

}
