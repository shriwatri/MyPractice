
public class Swapping2Numbers {

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println("Before swapping values are: "+ a + " "+b);
		//First Logic  - Using the third variable
//		int t = a;
//		a = b;
//		b = t;
//		System.out.println("After swapping with third variable values are: "+ a + " "+b);
		
		//Logic 2 - use + & - without using 3rd variable
//		a = a+b; // 10+20=30
//		b = a-b; // 30-20=10
//		a = a-b; // 30-10=20
		//System.out.println("After swapping with use + & - without using 3rd variable variable values are: "+ a + " "+b);
	
	//Logic 3 - use * and / without using 3rd variable
//		a = a*b; //10*2 =200
//		b = a/b; //200/20 =10
//		a = a/b; //200/10 =20
//		System.out.println("After swapping with  * and / - without using 3rd variable variable values are: "+ a + " "+b);
//		
		// Logic 4 - bitwise XOR (^);
//		a = a^b; //10^20 = 30
//		b = a^b; //30^20 = 10
//		a = a^b; //30^10 = 20
		
		//Logic 5 single statement
		b = a+b -(a=b);  //expression executed from right to left
		System.out.println("After swapping value is: "+ a +" "+b);
	}

}
