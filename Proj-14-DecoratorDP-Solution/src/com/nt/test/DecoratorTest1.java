package com.nt.test;

import com.nt.comp.Icecream;
import com.nt.comp.VanilaIcecream;
import com.nt.decorator.ChocolateDecorator;
import com.nt.decorator.DryFruitsDecorator;
import com.nt.decorator.HoneyDecorator;

public class DecoratorTest1 {

	public static void main(String[] args) {
		Icecream ice1= new VanilaIcecream();
		ice1.prepare();
		System.out.println("-----------------------------------");
		Icecream ice2=new DryFruitsDecorator(new DryFruitsDecorator(new VanilaIcecream()));
		ice2.prepare();
		Icecream ice3=new DryFruitsDecorator(new HoneyDecorator(new VanilaIcecream()));
		ice3.prepare();
		Icecream ice4=new DryFruitsDecorator(new HoneyDecorator(new ChocolateDecorator(new VanilaIcecream())));
		ice4.prepare();

	}

}
