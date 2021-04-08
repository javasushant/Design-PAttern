package com.nt.test;

import com.nt.comp.BalenoCar;
import com.nt.comp.Car;
import com.nt.comp.CarTyres;

public class Customer1 {

	public static void main(String[] args) {
		CarTyres tyres=new CarTyres();
		Car car=new BalenoCar(tyres);
		car.assemble();
		car.roadTest();
		System.out.println(car);

	}

}
