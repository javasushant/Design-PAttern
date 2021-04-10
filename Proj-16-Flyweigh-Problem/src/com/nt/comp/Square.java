package com.nt.comp;

public class Square implements IShape  {
	private String label;
	
	public Square() {
		System.out.println("Circle.0-param-constructor");
		label="square";
	}

	@Override
	public void draw(float side, String fillColor, String lineStyle) {
		System.out.println("drawing Square with side : "+side+" having filcolor "+fillColor+"  "+" line Color "+lineStyle);;
		
	}
	
}
