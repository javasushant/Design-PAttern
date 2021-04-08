package com.nt.test;

import com.nt.comp.Car;
import com.nt.comp.CarTyres;
import com.nt.comp.SwiftCar;

public class Customer2 {

	public static void main(String[] args) {
		CarTyres tyres=new CarTyres();
		Car car=new SwiftCar(tyres);
		car.assemble();
		car.roadTest();
		System.out.println(car);

	}

}
