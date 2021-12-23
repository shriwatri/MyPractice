import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		int array[] = new int[5];
		System.out.println("Enter the value for array");
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i < array.length-1;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Printing the element before insert");
		
		for(int i: array) {
			System.out.println(i);			
		}
		System.out.println("Enter the location which we want to insert in the array:");
		int location= sc.nextInt();
		System.out.println("Enter the value which we want to insert in the array:");
		int value= sc.nextInt();
		
		for(int i=array.length-1; i > location ;i--) {
			System.out.println("Before array[i]= "+array[i]);
			array[i]=array[i-1];
			System.out.println("array[i]= "+array[i]+" array[i-1] "+ array[i-1]);
		}
		array[location]=value;
		
		for(int i: array) {
			System.out.println(i);			
		}

	}

}
