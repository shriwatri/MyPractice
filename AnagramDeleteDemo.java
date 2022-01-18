
public class AnagramDeleteDemo {

	public static void main(String[] args) {
		String str1="javar";
		String str2="avaj";
		System.out.println(anagramCheck(str1, str2));
	}
	
	public static boolean anagramCheck(String str1, String str2) {
		char[] charString1 =str1.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		for (char c : charString1) {
			int index = sb.indexOf(String.valueOf(c));
			if(index!=-1) {
				sb.deleteCharAt(index);
			}
			else {
				return false;
			}
			
		}
		return sb.length()==0;
	}

}
