import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {10,20,30,40,50,60,70,80,90}; //Should be in sorted order.
		boolean flag = false;
		int l=0;
		int h = a.length-1;
		int key =50;
		
		/*
		 *Approach 1
		while(l <= h) {
			int m = (l+h)/2;
			
			if(a[m] == key) {
				System.out.println("Element found.");
				flag=true;
				break;
			}
			if(a[m] < key) {
				l=m+1;
				
			}
			if(a[m] > key) {
				h=m-1;
			}
			
		}
		if(flag==false) {
			System.out.println("Element not found");
		}  */
		
		//Approach 2
		System.out.println("Element "+ key+" with the help of Arrays.binarySearch(a, key) found in index: "+Arrays.binarySearch(a, key));

	}

}
