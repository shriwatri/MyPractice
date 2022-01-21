
public class SwapNumberByMultipication {

	public static void main(String[] args) {
		int a=55,b=28;
		System.out.println("Before swaping a="+a);
		System.out.println("Before swaping b="+b);
		swap(a, b);

	}
	public static void swap(int a,int b) {
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("After swaping a="+a);
		System.out.println("After swaping b="+b);
	}

}
