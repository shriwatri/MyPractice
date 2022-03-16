import java.util.HashMap;
import java.util.Map;

public class ArraysMajorityElement {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		int array[]= {5,20,5,5,5,10};
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0)+1);
			
		}
		
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue() > array.length/2) {
				int result = entry.getKey();
				System.out.println(result);
			}
		}

	}

}
