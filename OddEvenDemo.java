import java.util.Scanner;

public class OddEvenDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number to know odd/even:");
		int number = scn.nextInt();
		int result = (number/2)*2;
		if(result==number){
			System.out.println("Number is Even.");
		}else {
			System.out.println("Number is Odd.");
		}
		

	}

}
