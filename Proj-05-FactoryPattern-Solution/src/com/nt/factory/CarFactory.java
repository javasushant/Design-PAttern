package com.nt.factory;

import com.nt.comp.BalenoCar;
import com.nt.comp.Car;
import com.nt.comp.CarTyres;
import com.nt.comp.ErtigaCar;
import com.nt.comp.SwiftCar;

public class CarFactory {
	
	public static Car getCar(CarType type) {
		Car car=null;
		CarTyres tyres=new CarTyres();
		 if(type==CarType.BALENO) {
		    	car=new BalenoCar(tyres);
		    }
		    else if(type==CarType.SWIFT) {
		    	car=new SwiftCar(tyres);
		    }
		    else if(type==CarType.ERTIGA) {
		    	car=new ErtigaCar(tyres);
		    }
		    else {
		    	throw  new IllegalArgumentException("invalid car type");
		    }
		 car.assemble();
		 car.roadTest();
		 return car;
	}
}
