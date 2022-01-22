
public class ShallowAndDeepCloaningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		SDAddress address = new SDAddress("Pune", "Maharastra", 411017);
		SDEmployee emp1 = new SDEmployee(101, "Ashish Kumar Shriwatri", "Maxima IT Consulting Pune", address);
		SDEmployee emp2=(SDEmployee) emp1.clone(); //shallow cloning
		
		emp2.getAddress().setCity("Bangalore");//During shallow cloning it will change to original object
		System.out.println("Emp1 >>> "+emp1);
		System.out.println("Emp2 >>> "+emp2);

	}

}
