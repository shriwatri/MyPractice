import java.util.HashMap;
import java.util.Iterator;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		hm.put(1, 1);
		hm.put(2, 2);
		hm.put(3, 3);
		
		Iterator<Integer> itr = hm.keySet().iterator();
		while(itr.hasNext()) {
			Integer key = itr.next();
			System.out.println("Map Value: "+hm.get(key));
			if(key.equals(2)) {
				hm.put(4, 4);
				
			}
		}
	}

}
