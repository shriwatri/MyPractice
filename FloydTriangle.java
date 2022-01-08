import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {
		int numberOfRow,c,d,num=1;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of row");
		numberOfRow=scn.nextInt();
		System.out.println("Floyds Trinagle");
		System.out.println("---------------");
		for(c=1;c<=numberOfRow;c++) {
			for(d=1;d<=c;d++) {
			 System.out.print(num+" ");
			 num++;
			}
			System.out.println(" ");
		}
		System.out.println("---------------");
		
	}

}
