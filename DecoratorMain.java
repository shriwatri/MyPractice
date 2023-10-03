package com.shriwatri.designpattern.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		Cofee simpleCofee = new SimpleCofee();
		System.out.println(simpleCofee.getDescription() + " Cost "+ simpleCofee.cost());
		
		//Adding Milk to the cofee
		Cofee milkCofee = new MilkDecorator(simpleCofee);
		System.out.println(milkCofee.getDescription()+ " Cost "+ milkCofee.cost());
		
		//Adding Sugar to the cofee
		Cofee sugerMilkCofee = new SugarDecorator(milkCofee);
		System.out.println(sugerMilkCofee.getDescription()+" Cost "+sugerMilkCofee.cost());
		
	}

}
