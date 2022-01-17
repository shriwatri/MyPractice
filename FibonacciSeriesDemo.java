
public class FibonacciSeriesDemo {

	public static void main(String[] args) {
		int count = 10;
		int fibo[] = new int[count];
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < count; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		for (int i : fibo) {
			System.out.println(i);

		}

	}

}
