import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("Before Swap element:"+list);
		Collections.swap(list, 3, 4);
		System.out.println("After Swap element:"+list);
	}

}
