import java.util.Scanner;

public class CountsWords {

	public static void main(String[] args) {
		System.out.println("Please enter the string");
		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		int count=1;
		
		for(int i=0; i < s.length()-1;i++) {
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println("Number of character in String: "+count);

	}

}
