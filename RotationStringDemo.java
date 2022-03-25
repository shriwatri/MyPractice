
public class RotationStringDemo {

	public static void main(String[] args) {
		System.out.println(isRotatedVersion("abcd", "cdab"));
	}
	
	public static boolean isRotatedVersion(String str, String rotatedString) {
		if(str==null || rotatedString==null) {
			return false;
		}else if(str.length()!=rotatedString.length()) {
			return false;
		}else {
			String concatedString =str+str;		
			return concatedString.contains(rotatedString);
		}
	}

}
