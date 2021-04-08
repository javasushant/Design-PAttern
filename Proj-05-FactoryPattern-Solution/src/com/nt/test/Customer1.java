package com.nt.test;

import com.nt.comp.BalenoCar;
import com.nt.comp.Car;
import com.nt.comp.CarTyres;
import com.nt.factory.CarFactory;
import com.nt.factory.CarType;

public class Customer1 {

	public static void main(String[] args) {
		Car car=CarFactory.getCar(CarType.BALENO);
		System.out.println(car);
		

	}

}
