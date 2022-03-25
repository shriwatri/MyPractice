import java.util.Map;
import java.util.TreeMap;

public class VowelWordCount {

	public static void main(String[] args) {
	String str = "I Love My India.";
	VowelWordCount vowelWordCount = new VowelWordCount();
	vowelWordCount.getVowelWordCount(str); 
	vowelWordCount.frequency(str);
	}

	private void frequency(String str) {
		
		TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Integer c = map.get(str.charAt(i));
			if(map.get(str.charAt(i))==null) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), ++c);
			}
			
			
			
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println("Character:"+entry.getKey()+" frequency:"+entry.getValue());
		}
		
	}

	private void getVowelWordCount(String str) {
		int wordCount=0;int vowelCount=0; int upperCaseCount=0;
		for(int i=0; i < str.length(); i++) {
			char c= str.charAt(i);
			switch (c) {
			case ' ':
			case '.':
				wordCount++;
			}
			
			
			switch(c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			vowelCount++;
			
			}
			if(c >=65 && c<=90) {
				upperCaseCount++;
			}
		}
		System.out.println("Word Count:"+ wordCount);
		System.out.println("Vowel Count:"+ vowelCount);
		System.out.println("Uppercase Count:"+ upperCaseCount);
		
	}

}
