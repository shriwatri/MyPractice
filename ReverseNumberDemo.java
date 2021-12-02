import java.util.Scanner;

public class ReverseNumberDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int num = scan.nextInt();
		
		//1. Using algorithm
		/*
		 * int rev =0;
		 * 
		 * while(num!=0) { rev = rev * 10 + num%10; //0*10 +1234%10 num = num/10;
		 * 
		 * }
		 */
		
		//Using String Buffer class
		/*
		 * StringBuffer sb = new StringBuffer(String.valueOf(num)); StringBuffer rev =
		 * sb.reverse();
		 */
		
		//3. Using string Builder class
		StringBuilder sb = new StringBuilder();
		sb.append(num);
		 StringBuilder rev = sb.reverse();
		System.out.println("Reverse ummber is: " + rev);
		
		
		
		

	}

}
