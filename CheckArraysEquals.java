import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int a[] = {2,3,4,5,6};
		int b[] = {2,3,4,5,6};
		
		//Apporach1
		/*
		boolean status = Arrays.equals(a, b);
		if(status==true) {
			System.out.println("Array is equal.");
		}else {
			System.out.println("Array is not equal.");
		}
		*/
		
		//Approach 2
		boolean status =true;
		if(a.length == b.length) {
			for(int i=0 ; i < a.length ; i++) {
				if(a[i] != b[i]) {
					status=false;
					
				}
			}
			
		}
		else {
			status =false;
		}
		
		if(status == true) {
			System.out.println("Arrays are equal. "+Arrays.toString(a) +" "+Arrays.toString(b));
		}else {
			System.out.println("Arrays are not equal. "+Arrays.toString(a) +" "+Arrays.toString(b));
		}

	}

}
