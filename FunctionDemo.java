import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer,Integer> squareMe = i -> i*i;
		System.out.println("Square me function output: " + squareMe.apply(5));

	}

}
