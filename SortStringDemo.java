import java.util.Arrays;

public class SortStringDemo {

	public static void main(String[] args) {
		String str = "Ashish";
		char ch[] =str.toCharArray();
		Arrays.sort(ch);
		String sortedString = new String(ch);
		System.out.println("sorted string of "+str+"is -->"+sortedString);
		System.out.println("Reverse String Demo");
		System.out.println("#############################");
		StringBuffer sb = new StringBuffer();
		sb.append(str);
		sb.reverse();
		System.out.println("Reverse string by string buffer reverse() method: "+sb);
		}

}
