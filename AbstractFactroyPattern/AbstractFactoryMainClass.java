package abstractFactoryPattern;

public class AbstractFactoryMainClass {

	public static void main(String[] args) {
		// First get factory instance from factory of factory class, if you want trainees.
		AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
		
		Profession engg = abstractFactory.getProfession("Engineer");
		engg.print();

	}

}
