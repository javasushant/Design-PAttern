package com.nt.comp;

public class Circle implements IShape  {
	private String label;
	
	public Circle() {
		System.out.println("Circle.0-param-constructor");
		label="circle";
	}

	@Override
	public void draw(float radius, String fillColor, String lineStyle) {
		System.out.println("drawing Circle with side : "+radius+" having filcolor "+fillColor+"  "+" line Color "+lineStyle);;
		
	}
	
}
