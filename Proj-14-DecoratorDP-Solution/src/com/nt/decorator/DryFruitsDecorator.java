package com.nt.decorator;

import com.nt.comp.Icecream;

public class DryFruitsDecorator extends IcecreamDecorator {

	public DryFruitsDecorator(Icecream icecream) {
		super(icecream);
	}
	 @Override
	public void prepare() {
		super.prepare();
		addDryFruits();
	}
	public void addDryFruits() {
		System.out.println("adding DryFruits");
		
	}

}
