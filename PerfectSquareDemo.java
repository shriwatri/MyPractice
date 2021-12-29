import java.util.Scanner;

public class PerfectSquareDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number to know perfect square");
		Integer num= scn.nextInt();
		for(int i=1;i <= num/2;i++) {
			if(i*i==num) {
				System.out.println("Given number is square of:"+i);
				return;
			}
		}

	}

}
