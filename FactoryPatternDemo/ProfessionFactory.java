package dessign.pattern.factory;

public class ProfessionFactory {
	
	public Profession getProfession(String typeOfProfession) {
		if(typeOfProfession == null) {
			return null;
		}
		if(typeOfProfession == "Doctor") {
			return new Doctor();
		}
		if(typeOfProfession == "Engineer") {
			return new Engineer();
		}
		if(typeOfProfession == "Teacher") {
			return new Teacher();
		}
		
		return null;
		
	}

}
