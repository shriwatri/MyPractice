import java.util.function.Function;

public class FunctionalChainingDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> doubleIt = i -> i*2;
		System.out.println("Double Function: "+doubleIt.apply(2));
		
		Function<Integer, Integer> cubeIt = i -> i*i*i;
		System.out.println("Cube Function: "+cubeIt.apply(2));
		
		System.out.println("First Doubling using apply " + doubleIt.andThen(cubeIt).apply(2));
		
		System.out.println("First Cubing using apply " + doubleIt.compose(cubeIt).apply(2));

	}

}
