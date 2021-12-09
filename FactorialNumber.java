import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number for factorial");
	
		int num =scn.nextInt();
		long factValue =1;
		/*
		for(int i =1; i <= num ; i++) {
			factValue = factValue * i;
		}
		*/
		
		for(int i =num; i >=1 ; i--) {
			factValue = factValue * i;
		}
		System.out.println("Factorial value is: "+ factValue);
	}

}
