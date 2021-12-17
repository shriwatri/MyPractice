import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordOccuranceByJava8 {

	public static void main(String[] args) {
		String input ="Welcome to you and we Welomes you";
		List<String> list = Arrays.asList(input.split(" "));
		Map<String, Long> map = list.stream().
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		/*
		Function<String, String> fn = Function.identity();
		System.out.println(fn.apply("Rajesh"));
		
		*/

	}

}
