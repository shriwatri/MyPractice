import java.util.Scanner;

public class MatrixDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int r,c;
		System.out.println("Enter number of row in matrix:");
		r = scn.nextInt();
		System.out.println("Enter number of columns in matrix:");
		c = scn.nextInt();
		int matrix[][] = new int[r][c];
		System.out.println("Enter the element in matrix:");
		for(int i=0; i < r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=scn.nextInt();
				
			}
		}

		System.out.println("Display the element in matrix:");
		for(int i=0; i < r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(matrix[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
