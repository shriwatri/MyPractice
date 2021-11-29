
public class Child extends Parent{
	
	public  void mw() {
		System.out.println("Child Start:-------> ");
		String cm ="Child Method";
		System.out.println("inside child method: "+id+"" + name);
		m1(5, cm);
		System.out.println("Child End: <------- ");
		
	}
	

}
