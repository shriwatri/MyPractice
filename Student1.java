
public class Student1 implements Comparable<Student1> {
	int rollNumber;
	String name;
	int age;
	
	

	public Student1(int rollNumber, String name, int age) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
	}



	public int getRollNumber() {
		return rollNumber;
	}



	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(Student1 st) {
		if(age == st.age) {
			return 0;
		}if(age > st.age) {
			return 1;
		}else
		return -1;
	}
	
}


