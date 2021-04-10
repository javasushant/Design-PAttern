package com.nt.test;

import com.nt.comp.IShape;
import com.nt.factory.ShapeFactory;

public class FlyWeightProblemTest {

	public static void main(String[] args) {
		for(int i=1;i<=500;i++) {
			IShape shape =ShapeFactory.getShape("square");
			System.out.println(shape.hashCode());
			shape.draw(i+10, "Red", "Dotted");
		}
		for(int i=1;i<=500;i++) {
			IShape shape =ShapeFactory.getShape("circle");
			System.out.println(shape.hashCode());
			shape.draw(i+10, "green", "buttered");
		}

	}

}
