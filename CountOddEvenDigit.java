
public class CountOddEvenDigit {

	public static void main(String[] args) {
		int num = 24854321;
		int evenCount=0,oddCount=0;
		while(num>0) {
			int remainder =num%10;
			if(remainder%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Even Count:"+evenCount);
		System.out.println("Odd Count:"+oddCount);

	}

}
