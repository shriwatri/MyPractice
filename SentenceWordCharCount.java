import java.util.Arrays;

public class SentenceWordCharCount {

	public static void main(String[] args) {
		String str ="Ashish Kumar Shriwatri";
		String strArray[] =str.split(" ");
		System.out.println(Arrays.toString(strArray));
		for(String word : strArray) {
			System.out.println(word+"->"+word.length());
			
		}
		System.out.println("===========================");
		System.out.println("Second Approcah");
		System.out.println("===========================");
		String input ="Welcome to My country.";
		System.out.println("Input String is: "+input);
		count(input);

	}
	
	static void count(String str) {
		//Create an character string for given sentence
		char[] ch =str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String str1 = "";
			while(i < ch.length && ch[i]!= ' ') {
				str1=str1+ch[i];
				i++;
			}
			if(str1.length() > 0) {
				System.out.println(str1+"->"+str1.length());
			}
			
			
		}
		
	}

}
