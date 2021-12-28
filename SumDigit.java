
public class SumDigit {

	public static void main(String[] args) {
		int num =1234;
		int initNum=num;
		int sum =0, digit=0;
		while(num > 0) {
			digit=num%10;
			sum=sum+digit;
			num/=10;
		}
		System.out.println("Sum of digit"+initNum+" ="+sum);

	}

}
