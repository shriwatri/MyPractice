
public class EvenOddFromArray {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5,6};
		//Extracting even number....
		System.out.println("Even number in array...");
		/*
		for(int i=0; i < a.length-1; i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		*/
		//Enhanced Loop
		for(int value:a) {
			if(value%2==0) {
				System.out.println(value);
			}
		}
		
		System.out.println("Odd number in array...");
		/*
		for(int i=0; i < a.length-1; i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
		*/
		//Enhanced Loop
				for(int value:a) {
					if(value%2!=0) {
						System.out.println(value);
					}
				}
	}

}
