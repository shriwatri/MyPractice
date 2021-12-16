
public class ReverseEachWordInAString {

	public static void main(String[] args) {
		//Approach1
		/*
		String str ="Welcome to java"; //original string
		String words[] = str.split(" "); //Splitting string into words
		
		String reverseString = "";
		
		for(String w:words) {
			String reverseWord = "";
			
			for(int i=w.length()-1;i>=0;i--) {
				
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString =reverseString+reverseWord+" "; 
			
		}
		System.out.println(reverseString);
		
	*/
		
		//Approach2
		String str ="Welcome to java"; //original string
		String words[] = str.split("\\s"); //Splitting string into words
		
		String reverseWord = "";
		for(String s:words) {
			StringBuilder sb = new StringBuilder(s);
			//StringBuilder sb = new StringBuilder(s);
			//sb.append(s);
			sb.reverse();
			reverseWord = reverseWord+sb.toString()+" ";
			
		}
		System.out.println(reverseWord);
		
		
		
	}

}
