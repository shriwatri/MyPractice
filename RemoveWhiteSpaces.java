
public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "Ashish Kumar Shriwatri";
		System.out.println("String before apply replace: "+ str);
		str =str.replaceAll("\\s", ""); //"//s" is used for space
		System.out.println("String after apply  str.replaceAll(\"\\\\s\", \"\"): "+ str);

	}

}
