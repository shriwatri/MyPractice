
public class CountsNumberDemo {

	public static void main(String[] args) {
		int number =6786673;
		/*int count =0;
		while(number !=0) {
			number=number/10;
			count++;
		}
		System.out.println(count);
		*/
		System.out.println(countNumber(number));
		System.out.println(String.valueOf(4562).length());
			

	}
	static int countNumber(Integer n) {
		if(n==0) {
			return 0;
			
		}
		return 1+countNumber(n/10);
	}

}
