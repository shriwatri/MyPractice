import java.util.Scanner;

public class AlphabetCheck {

	public static void main(String[] args) {
		System.out.println("Enter the character:");
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		if((ch>='a' && ch <= 'z') || (ch>='A' && ch <= 'Z') ) {
			System.out.println("The given character is alphabet.");
		}else {
			System.out.println("The given character is not a alphabet.");
		}

	}

}
