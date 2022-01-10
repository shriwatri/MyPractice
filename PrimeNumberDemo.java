import java.util.Scanner;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to find out Prime or not:");
		int number = scn.nextInt();
		boolean prime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime=false;
				System.out.println("Divide by: "+i);
			}
			
		}
		if(prime==true) {
			System.out.println("Number is prime");
		}else {
			System.out.println("Not a Prime number.");
		}
		

	}

}
