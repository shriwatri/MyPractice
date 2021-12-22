import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the string:");
		String str = scn.nextLine();
		int initialLength = str.length();
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Please enter the character to find the occurance:");
		String str1 = scn1.next();
		str=str.replace(str1, "");
		int finalLength = str.length();
		System.out.println("Total number of occurance of character: "
		+str1+" "+ (initialLength-finalLength));
		

	}

}
