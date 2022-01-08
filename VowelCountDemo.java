import java.util.Scanner;

public class VowelCountDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = scn.next();
		char[] chars = str.toCharArray();
		int count=0;
		for(char c: chars) {
			switch (c) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
				break;			
			}
		}
		System.out.println("Number of vowel in string:"+count);

	}

}
