import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice;
		int sum=0;
		int mul=1;
		int n =args.length;
		System.out.println("1 - Sum");
		System.out.println("2 - Average");
		System.out.println("3 - Multiplication");
		System.out.println("Enter your choice.");
		choice = scn.nextInt();
		System.out.println("Enter number (separated with comma) to perform operations.");
		
		Scanner scn1 = new Scanner(System.in);
		String inputNumber = scn1.next();
		String numbers[] =inputNumber.split(",");
		
		for (int i = 0; i < numbers.length; i++) {
			sum=sum+Integer.parseInt(numbers[i]);
		}
		
		switch (choice) {
		case 1:
			System.out.println("Sum is="+sum);
			break;
			
		case 2:
			System.out.println("Average is="+sum/numbers.length);
			break;
			
		case 3:
			for (String string : numbers) {
				mul = mul * Integer.parseInt(string);
			}
			System.out.println("Multiplication is="+mul);
			break;

		default:
			System.out.println("Please enter the correct choice from 1 to 3");
			break;
		}
		
		

	}

}
