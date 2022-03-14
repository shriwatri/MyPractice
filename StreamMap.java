import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

	public static void main(String[] args) {
		List<String> listOfString = Arrays.asList("1","2","3","4","5","6");
		List<Integer> listOfInteger =listOfString
				.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		System.out.println(listOfInteger);

	}

}
