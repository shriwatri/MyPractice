package com.shriwatri.designpattern.decorator;

public class MilkDecorator implements Cofee{
	private Cofee cofee;

	public MilkDecorator(Cofee cofee) {
		this.cofee = cofee;
	}
	
	@Override
	public String getDescription() {
		return cofee.getDescription() + " with Milk";
	}
	
	
	@Override
	public double cost() {
		return cofee.cost()+0.5;
	}
	

}
