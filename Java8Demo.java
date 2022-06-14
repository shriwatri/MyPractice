import java.util.Arrays;
import java.util.List;

public class Java8Demo {

	public static void main(String[] args) {
		System.out.println("Welcome");
		List<Integer> list = Arrays.asList(23,4,6,7,8,9,2,1,10);
		list.stream().filter(t -> t>4).sorted().forEach(System.out::println);
		

	}

}
