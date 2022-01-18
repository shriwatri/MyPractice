import java.util.Map;
import java.util.TreeMap;

import org.apache.commons.collections4.map.HashedMap;

public class SortMapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashedMap<>();
		map.put("Apple", "apple");
		map.put("Orange", "orange");
		map.put("Banana", "banana");
		map.put("Guava", "guava");
		map.put("Pineapple", "pineapple");
		
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("unsorted Key="+ entry.getKey()+" Value="+entry.getValue());
			
		}
		System.out.println("=====================================");
		
		Map<String, String> treeMap =new TreeMap<String, String>(map);
		for(Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("sorted Key with treeMap="+ entry.getKey()+" Value="+entry.getValue());
			
		}

	}

}
