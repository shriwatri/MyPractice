import java.math.BigInteger;

public class FactorialBigIntegerDemo {

	public static void main(String[] args) {
		int number = 20;
		BigInteger fact = BigInteger.ONE;
		for (int i = 1; i <= number; i++) {
			fact =fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}
