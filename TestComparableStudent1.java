import java.util.ArrayList;
import java.util.Collections;

public class TestComparableStudent1 {

	public static void main(String[] args) {
		ArrayList<Student1> al = new ArrayList<Student1>();
		al.add(new Student1(107,"Yogesh",20));
		al.add(new Student1(101,"Ashish",23));
		al.add(new Student1(102,"Anupam",10));
		al.add(new Student1(105,"Devshaya",11));
		al.add(new Student1(106,"Monti",24));
		al.add(new Student1(103,"Prisha",5));
		al.add(new Student1(104,"Yashashvee",20));
		
		Collections.sort(al);
		
		for (Student1 st : al) {
			System.out.println(st.rollNumber+" "+st.name+" "+ st.age);
		}

	}

}
