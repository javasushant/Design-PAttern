package com.nt.factory;

import com.nt.comp.Circle;
import com.nt.comp.IShape;
import com.nt.comp.Square;

public class ShapeFactory {
	
	public static IShape getShape(String type) {
		IShape shape=null;
		if(type.equalsIgnoreCase("circle"))
			shape=new Circle();
		else if(type.equalsIgnoreCase("square"))
			shape=new Square();
		else
			throw new IllegalArgumentException("Invalid SHape type");
		return shape;
	}
}
