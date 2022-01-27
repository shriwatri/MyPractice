import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number to findout is it Prime or not?");
		int num = scn.nextInt();
		boolean flag = false;
		for(int i=2; i <=num/2; i++) {
			if(num%i == 0) {
				flag=true;
			}
		}
		if(!flag) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}

	}

}
