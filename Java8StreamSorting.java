import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamSorting {

	public static void main(String[] args) {
		Student s1 = new Student("Raj", 20);
		Student s2 = new Student("Ashish", 30);
		Student s3 = new Student("Ram", 27);
		Student s4 = new Student("Vivek", 30);
		Student s5 = new Student("John", 29);

		List<Student> studentList = new ArrayList<Student>();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);

		for (Student student : studentList) {
			System.out.println(student);
		}
		List<Student> sortedList = studentList
				.stream()
				.sorted(Comparator.comparingInt(Student::getAge).reversed())
				.collect(Collectors.toList());
		System.out.println("Sorted list by age");

		sortedList.forEach(System.out::println);

		System.out.println("Sorted list by Name");
		List<Student> sortedList1 = studentList.stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
		sortedList1.forEach(System.out::println);
	}

	public static class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
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
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}

	}

}
