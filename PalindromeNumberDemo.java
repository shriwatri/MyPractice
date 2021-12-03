import java.util.Scanner;

public class PalindromeNumberDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number:");
		int num = scn.nextInt();
		int org_num = num;
		int rev = 0;
		
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		if(org_num == rev) {
			System.out.println(org_num+ " is a Palindrome Number.");
			
		}else {
			System.out.println(org_num+ " not a Palindrome Number.");
		}
	}

}
