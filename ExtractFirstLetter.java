import org.apache.commons.compress.archivers.StreamingNotSupportedException;

public class ExtractFirstLetter {

	public static void main(String[] args) {
		String str ="Ashish Kumar Shriwatri";
		splitWords(str);

	}

	private static void splitWords(String str) {
		String words[] = str.split(" ");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < words.length; i++) {
			String s = words[i];			
			System.out.println(s.charAt(0));
			sb=sb.append(s.charAt(0));			
		}
		System.out.println("String buffer output: "+sb);
		
	}

}
