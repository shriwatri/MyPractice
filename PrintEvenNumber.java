import java.util.Scanner;

public class PrintEvenNumber {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number till you want to print even number:");
		int num = scn.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
