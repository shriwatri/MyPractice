package abstractFactoryPattern;

public class ProfessionAbstractFactory extends AbstractFactory {
	
	@Override
	public Profession getProfession(String typeOfProfession) {
		if(typeOfProfession == null) {
			return null;
		}
		if(typeOfProfession == "Teacher") {
			return new Teacher();
		}
		if(typeOfProfession == "Engineer") {
			return new Engineer();
		}
		
		return null;
	}

}
