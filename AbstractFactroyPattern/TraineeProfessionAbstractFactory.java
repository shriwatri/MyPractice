package abstractFactoryPattern;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
	
	@Override
	public Profession getProfession(String typeOfProfession) {
		if(typeOfProfession == null) {
			return null;
		}
		if(typeOfProfession == "Teacher") {
			return new TraineeTeacher();
		}
		if(typeOfProfession == "Engineer") {
			return new TraineeEngineer();
		}
		
		return null;
	}

}
