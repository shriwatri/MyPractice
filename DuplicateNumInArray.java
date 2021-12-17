import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumInArray {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,30,40,60,10,30,50,20,40,80,90,80);
		Set<Integer> set = new HashSet<>();
		list.stream().filter(x -> !set.add(x))
		.collect(Collectors.toSet())
		.forEach(x -> System.out.println(x));
		
		

	}

}
