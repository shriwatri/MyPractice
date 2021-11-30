package dessign.pattern.factory;

public class FactoryPatternMainClass {
	public static void main(String[] args) {
		ProfessionFactory pf = new ProfessionFactory();
		
		Profession doc = pf.getProfession("Doctor");
		doc.print();		
		
	}

}
