import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int a[] = {6,4,1,2,3,5};
		System.out.println("Array before starting: "+ Arrays.toString(a));
		int length = a.length;
		for(int i=0;i<length-1;i++) {
			for(int j=0;j<length-1;j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] =a[j+1];
					a[j+1]=temp;
				}
				
			}
			
		}
		System.out.println("Array after starting: "+ Arrays.toString(a));
	}

}
