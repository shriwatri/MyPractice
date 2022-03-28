
public class VowelConsonentCount {

	public static void main(String[] args) {
		String str = "Ashish";
		countVowels(str);

	}

	private static void countVowels(String str) {
		int vowelCount = 0;
		int consonantCount =0;
		
		for(int i=0; i < str.length();i++ ) {
			if(isVowel(str.charAt(i))) {
				++vowelCount;
			}else {
				++consonantCount;
			}
		}
		System.out.println("Vowel Count:"+vowelCount);
		System.out.println("Consonant Count:"+consonantCount);
		
	}

	private static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch =='A' || ch=='I'|| ch =='E' || ch=='O' || ch =='U');
	}

}
