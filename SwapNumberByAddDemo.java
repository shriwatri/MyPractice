
public class SwapNumberByAddDemo {

	public static void main(String[] args) {
		int a=10,b=20;
		System.out.println("Before Swap a is "+a);
		System.out.println("Before Swap b is "+b);
		swap(a, b);
	}
	
	public static void swap(int a, int b) {
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("After Swap a is "+a);
			System.out.println("After Swap b is "+b);
			
	}

}
