
public class Parent {
	public int id = 1;
	public String name ="initialParentValue";
	
	public String m1(int id, String name) {
		System.out.println("Parent Start:-------> ");
		//id = 2;
		//name = "Ashish";
		System.out.println("Inside parent m1 method: here is id and Name:"+id +" "+ name);
		System.out.println("Parent Stop: <------- ");
		return name;
		
		
	}
	

}
