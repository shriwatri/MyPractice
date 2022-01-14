import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String str1 ="java";
		String str2 ="avaj";
		System.out.println("Both the srting are Anagram: "+anagramCheck(str1, str2));
	}
	
	public static boolean anagramCheck(String str1, String str2) {
		char[] charArrayStr1 = str1.toCharArray();
		char[] charArrayStr2 = str2.toCharArray();
		Arrays.sort(charArrayStr1);
		Arrays.sort(charArrayStr2);
		return Arrays.equals(charArrayStr1, charArrayStr2);
	}

}
