import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		char c = getFirstNonRepeatedChar("aabbkkllmmxttjj");
		System.out.println("Non repeated character= "+c);

	}

	public static Character getFirstNonRepeatedChar(String str) {
		char[] charArray = str.toCharArray();
		Map<Character,Integer> countMap = new LinkedHashMap<>();
		for (char c : charArray) {
			countMap.put(c, countMap.containsKey(c) ? countMap.get(c)+1 :1);
		}
		for (Entry<Character, Integer> entry : countMap.entrySet()) {
			if(entry.getValue()==1) {
				return entry.getKey();
			}
			
		}
		throw new RuntimeException("Didn't find any non repeated character.");
	}
}
