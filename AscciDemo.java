import java.util.Scanner;

public class AscciDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the char which you want ascii value:");
		char ch =scn.next().charAt(0);
		asciiValue(ch);

	}

	private static void asciiValue(char ch) {
		
		int i=ch;
		System.out.println("Ascii value of "+ch+" "+i);
	}

}
