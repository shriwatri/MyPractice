import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number for table:");
		int number = scn.nextInt();
		System.out.println("Table for "+number);
		System.out.println("=========================");
		for(int i=1;i<=10;i++) {			
			System.out.println(number*i);
		}
		System.out.println("=========================");

	}

}
