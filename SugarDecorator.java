package com.shriwatri.designpattern.decorator;

public class SugarDecorator implements Cofee {
	private Cofee cofee;
	  
	 public SugarDecorator(Cofee cofee) 
	 { 
		 this.cofee = cofee;
		 }

	@Override
	public String getDescription() {
		return cofee.getDescription() + " with Sugar";
	}

	@Override
	public double cost() {
		
		return cofee.cost()+0.2;
	}
	
	

}
