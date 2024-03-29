import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class PrintFrequency {

	public static void main(String[] args) {
		String str ="Banana";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length() ; i++) {
			char c = str.charAt(i);
			Integer value = map.get(c);
			if(value!=null) {
				map.put(c, (value+1));
			}else {
				map.put(c, 1);
			}
			
		}
		
		Set<Entry<Character,Integer>> set = map.entrySet();
		List<Entry<Character, Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
		
		Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {

			@Override
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {				
				return o2.getValue().compareTo(o1.getValue());
			}
		});
		
		for (Entry<Character, Integer> entry : list) {
			System.out.println("The frequency of occurency of "+entry.getKey()+" "+entry.getValue());
			
		}

	}

}
