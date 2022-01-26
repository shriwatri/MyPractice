
public class CompareStringDemo {

	public static void main(String[] args) {
		String str1 ="Ashishuu";
		String str2 ="bshisj";
		boolean isCompare = false;
		if(str1.length()==str2.length()) {
		for (int i = 0; i < str1.length(); i++) {
			if(str1.charAt(i)!=str2.charAt(i) ) {
				isCompare=false;
				break;
			}else {
				isCompare=true;
			}
			
		}
		}
		System.out.println("Both the string are equals:"+isCompare);

	}

}
