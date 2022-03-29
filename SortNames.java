import java.util.Scanner;

public class SortNames {

	public static void main(String[] args) {
		int n;
		String temp;
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of names you wants to sort");
		n=scn.nextInt();
		String names[] = new String[n];
		Scanner scn1 = new Scanner(System.in);
		System.out.println("Please enter all the names which you wants to add.");
		for(int i=0; i <n;i++) {
			names[i]=scn1.nextLine();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<n;j++) {
				if(names[i].compareTo(names[j]) > 0) {
					temp= names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		System.out.println("Sorted names:");
		for (String name : names) {
			System.out.println(name);
		}

	}

}
