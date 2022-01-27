import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number:");
		n=scn.nextInt();
		for (int i = 1; i <= n; i++) {
			sum=sum+i;
			
		}
		System.out.println("Sum="+sum);
		
	}

}
