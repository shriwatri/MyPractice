
public class FibonaciDemo {

	public static void main(String[] args) {
		int max = 10, n1 = 0, n2 = 1;
		for (int i = 1; i <= max; i++) {
			System.out.println(n1 + " ");
			int sum = n1 + n2;
			n1 = n2;
			n2 = sum;
		}
	}
}
