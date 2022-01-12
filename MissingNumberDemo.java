import java.util.Arrays;

public class MissingNumberDemo {

	public static void main(String[] args) {
		
		int arrays [] = {1,2,3,4,6};
		int missingNumber = getMissingNumber(arrays,6);
		System.out.printf("Missing number in array %s is %d %n",Arrays.toString(arrays),missingNumber);
	}

	private static int getMissingNumber(int[] arrays, int n) {
		int actualSum =0;
		int expectedSum =(n*(n+1)/2);
		for(int i:arrays) {
			actualSum+=i;
		}
		return expectedSum-actualSum;
	}

}
