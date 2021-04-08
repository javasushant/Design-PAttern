package com.nt.decorator;

import com.nt.comp.Icecream;

public class ChocolateDecorator extends IcecreamDecorator {

	public ChocolateDecorator(Icecream icecream) {
		super(icecream);
	}
	@Override
	public void prepare() {
		super.prepare();
		addChocolate();
	}
	public void addChocolate() {
		 System.out.println("adding Chocochips");
		
	}

}
