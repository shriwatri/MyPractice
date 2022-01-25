import java.util.Iterator;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class MapIteratorDemo {

	public static void main(String[] args) {
		Map<Integer, String> fruitMap = new HashedMap<Integer, String>();
		fruitMap.put(1, "Mango");
		fruitMap.put(2, "Apple");
		fruitMap.put(3, "Banana");
		fruitMap.put(4, "Pineapple");
		fruitMap.put(5, "Orange");
		System.out.println("<----Map iterat by Key set Iterator---->");
		keySetIteration(fruitMap);
		System.out.println("<----Map iterat by Iterator---->");
		iteratorMap(fruitMap);
		System.out.println("<----Map iterat by entry Set---->");
		entrySetMap(fruitMap);
		System.out.println("<----Map iterat by Java 8 Stream---->");
		streams(fruitMap);
		System.out.println("<----Map iterat by Java 8 foreach---->");
		foreachLoop(fruitMap);

	}
	private static void foreachLoop(Map<Integer, String> fruitMap) {
		fruitMap.forEach((key,value) ->{
			System.out.println("Key="+key+" Value="+value);			
		}
				
				);
		
	}
	private static void streams(Map<Integer, String> fruitMap) {
		fruitMap.entrySet().stream().forEach(
				e -> System.out.println("Key="+e.getKey()+" Value="+e.getValue())
				);
		
	}
	private static void entrySetMap(Map<Integer, String> fruitMap) {
		for (Map.Entry<Integer, String> entry : fruitMap.entrySet()) {
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());
			
		}
		
	}
	private static void iteratorMap(Map<Integer, String> fruitMap) {
		Iterator<Map.Entry<Integer, String>> iteratror = fruitMap.entrySet().iterator();
		while (iteratror.hasNext()) {
			Map.Entry<Integer, String> entry = iteratror.next();
			System.out.println("Key:"+entry.getKey()+" Value:"+entry.getValue());			
		}
		
	}

	private static void keySetIteration(Map<Integer, String> map) {
		for (Integer fruitId : map.keySet()) {
			System.out.println("Key value="+fruitId);
			System.out.println("Value="+map.get(fruitId));
			
		}
		
	}

}
