import java.util.ArrayList;
import java.util.List;

public class FilterDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to Filter Demo:");
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(25);
		arList.add(22);
		arList.add(32);
		arList.stream().filter(i -> i%2 ==0).forEach(x -> System.out.println(x));

	}

}
