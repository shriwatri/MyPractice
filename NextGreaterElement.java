
public class NextGreaterElement {

	public static void main(String[] args) {
		int array[] = {10,5,22,11,22,4,44,22};
		printNextGreaterElement(array);
		

	}

	private static void printNextGreaterElement(int[] array) {
		int next,i,j;
		for (i = 0; i < array.length; i++) {
			next=-1;
			for (j = (i+1); j < array.length; j++) {
				if(array[i] < array[j]) {
					next=array[j];
					break;
				}	
				else {
					break;
				}
			}
			System.out.println(array[i]+","+next);
			
		}
		
	}

}
