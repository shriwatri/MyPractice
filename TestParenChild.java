
public class TestParenChild {

	public static void main(String[] args) {

		Parent p = new Parent();
		System.out.println("Parent variable: "+ p.name + " id:"+ p.id);
		p.m1(5, "rajesh");
		Child c = new Child();
		c.m1(6, "childCall");
		c.mw();
		System.out.println("Checking from child id: "+c.id+"Name:"+ c.name);
		c.id=100;
		c.name="mainModification";
		System.out.println("Checking from child id: "+c.id+"Name:"+ c.name);

	}

}
