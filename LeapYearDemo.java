import java.util.Scanner;

public class LeapYearDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the year.");
		int year = scn.nextInt();
		
		if((year%400==0) || (year%4==0) && (year%100!=0 ) ) {
			System.out.println(year + " is a leap year.");
			
		}
		else {
			System.out.println(year + " is NOT a leap year.");
		}

	}

}
