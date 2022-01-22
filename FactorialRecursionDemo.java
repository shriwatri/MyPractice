
public class FactorialRecursionDemo {

	public static void main(String[] args) {
	System.out.println(factorail(5));	

	}
	public static int factorail(int num) {
		if(num == 0) {
			return 1;
		}
		return num*factorail(num-1);
	}

}
