import java.util.Scanner;

public class PalindromeStringDemo {

	public static void main(String[] args) {
		String reverse ="";
		Scanner scn= new Scanner(System.in);
		System.out.println("Please enter the string which you want to see palindrome check.");
		String str = scn.next();
		for (int i = str.length()-1; i >= 0; i--) {
			reverse =reverse+str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("Given String is palindrome");
		}else {
			System.out.println("Given String is NOT palindrome");
		}

	}

}
