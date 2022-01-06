import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "Ashish";
		System.out.println(removeDuplicateChar(str));

	}
	
	public static String removeDuplicateChar(String str) {
		Set<Character> set = new HashSet<Character>();
		StringBuffer sb = new StringBuffer();
		for(int i=0; i <str.length(); i++) {
			Character c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
