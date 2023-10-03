package com.shriwatri.designpattern.decorator;

public class SimpleCofee implements Cofee {

	@Override
	public String getDescription() {
		return "Simple Cofee";
	}

	@Override
	public double cost() {
		return 2.0;
	}

}
