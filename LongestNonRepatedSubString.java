import java.util.HashSet;

public class LongestNonRepatedSubString {

	public static void main(String[] args) {
		String str ="abcdabeefghijkabckabcdefghijklm";
		System.out.println(longest(str));
		

	}

	private static String longest(String str) {
		HashSet<Character> set = new HashSet<Character>();
		String longestOverAll = "";
		String longestTillNow = "";
		
		for(int i=0; i < str.length() ; i++) {
			char c=str.charAt(i);
			if(set.contains(c)) {
				longestTillNow="";
				set.clear();
			}
			set.add(c);
			longestTillNow+=c;
			if(longestTillNow.length() > longestOverAll.length()) {
				longestOverAll=longestTillNow;
			}
			
		}
		return longestOverAll;
		
	}

}
