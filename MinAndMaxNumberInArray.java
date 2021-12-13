import java.util.Arrays;

public class MinAndMaxNumberInArray {

	public static void main(String[] args) {
		int a[] = {50,30,20,3,60,80,10,5};
		int max = a[0];
		
	
		/*
		 * for(int i =0; i < a.length ; i++) { if(a[i] > max) { max =a[i]; } }
		 * System.out.println("Max element in array is: "+max); }
		 */
	
int min = a[0];
		
	
	for(int i =0; i < a.length ; i++) {
		if(a[i]  < min) {
			min =a[i];
		}
	}
	System.out.println("Min element in array is: "+min);
	}

}
