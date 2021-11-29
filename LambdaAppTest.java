
public class LambdaAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---------Two Argument Function Interface Demo-------");
		
		ComputeOne addSum = (a,b) ->  a+b;
		System.out.println("addSum.add(5, 5): "+addSum.add(5, 5));
		
		ComputeOne divideDemo = (a,b) ->  a/b;
		System.out.println("divideDemo.add(55, 5): "+divideDemo.add(55, 5));
		
		ComputeOne divideDemo1 = (a,b) -> { return a/b;};
		System.out.println("divideDemo1.add(55, 5): "+divideDemo1.add(55, 5));
		divideDemo1.add(66, 6);
		
		System.out.println("---------No Argument Functional Interface-------");
		Message message = () -> System.out.print( "Hello");
		message.greeting();
		
		
		
		Message message1 = () -> System.out.print( "Hello Bhai");
		message1.greeting();

	}

	public interface Message{
		public void greeting();
	}

}

