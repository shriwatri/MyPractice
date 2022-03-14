import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("Java", "c", "Python");

		List<String> result = lines.stream()
				.filter(line -> !"c".equals(line))
				.collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
