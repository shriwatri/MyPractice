import java.util.Comparator;
import java.util.stream.Stream;

public class Java8MinMax {

	public static void main(String[] args) {
		System.out.println("This is java 8 Min() and Max() Demo");
		Integer highest = Stream.of(1,2,3,55,77,5,7)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
		System.out.println("Input arrays (1,2,3,55,77,5,7) "+"Max value is:"+highest);
		
		Integer lowest = Stream.of(100,34,1,2,3,55,77,5,7)
				.min(Comparator.comparing(Integer::valueOf))
				.get();
		System.out.println("Input arrays (100,34,1,2,3,55,77,5,7) "+"Min value is:"+lowest);

	}

}
