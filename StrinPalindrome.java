import java.util.Scanner;

public class StrinPalindrome {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the Sting:");
		String str = scn.next();
		String org_str = str;
		
		String rev = "";
		int len = str.length();
		for(int i= len-1; i >=0 ;i--) {
			rev = rev+str.charAt(i);
			
		}
		if(org_str.equals(rev)) {
			System.out.println(org_str + " is a palindrom String.");
			
		}else {
			System.out.println(org_str + " is not a palindrom String.");
		}
	}

}
