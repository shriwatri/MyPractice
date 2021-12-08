import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number for which you want to check Prome or not");
		int input = scn.nextInt();
		
		int count =0;
		if(input > 1) {
			for(int i = 1; i <= input;i++) {
				if(input%i ==0) {
					count++;
				System.out.println("divide by "+ i);
				}
			}
			if(count==2) {
				System.out.println("Number "+input + " is a prime number.");
			}else {
				System.out.println("Number "+input + " is not a prime number.");
			}
			
		}else {
			System.out.println("Number is a not a Prime number.");
		}
	

	}

}
