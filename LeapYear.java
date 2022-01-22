import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the year");
		Scanner scn = new Scanner(System.in);
		
		try {
			int year = scn.nextInt();
			int length = String.valueOf(year).length();
			if(length ==4) {
			if((year%4)==0) {
				System.out.println("Year is leap year.");
			}else {
				System.out.println("It is not a leap year.");
			}

}
else {
			System.out.println("Please make sure 4 digit of year.");
			
}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Please enter valid date."+e.toString());
			e.printStackTrace();
		}
	}

}
