import java.util.ArrayList;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		System.out.println("Welcome to Filter Demo:");
		List<Integer> arList = new ArrayList<>();
		arList.add(15);
		arList.add(25);
		arList.add(22);
		arList.add(32);
		arList.stream().map(i -> i*i).forEach(x -> System.out.println(x));

	}

}
