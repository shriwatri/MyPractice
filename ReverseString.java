import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String input, reverse = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String for reverse:");
		input = scn.nextLine();
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse += input.charAt(i);
		}
		System.out.println(reverse);
	}

}
