import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

public class StringSplitDemo {

	public static void main(String[] args) {
		String s="091-1234567890";
		String str[] = s.split("-");
		printString(str, "String split method");
		System.out.println("==============================================");
		
		//2nd approcah
		List<String> strings= Pattern.compile("-").splitAsStream(s).collect(Collectors.toList());
		for (String string : strings) {
			System.out.println("Splitting String by pattern method:");
			System.out.println(string);
		}
		System.out.println("==============================================");
		
		//3rd Approach
		System.out.println("Splitting String by StringTokenizer:");
		StringTokenizer st = new StringTokenizer(s, "-");
		while (st.hasMoreElements()) {
			System.out.println(st.nextToken());
			//System.out.println(st.nextElement());
			
		}
		System.out.println("==============================================");
		//4th Approach
		String strUtil[] = StringUtils.split(s, "-");
		printString(strUtil, "String Utils split");
		
		System.out.println("==============================================");
		//5th Approach
		
		//Iterable<String> results = Splitter.on("-").split(s);
		//for (String string : results) {
			//System.out.println(string+" Guava Jar ");
		//}
		
		System.out.println("==============================================");
	}
	
	public static void printString(String str[], String approach) {
		System.out.println("Split string by approach: "+approach);
		for (String string : str) {
			System.out.println(string);
		}
	}

}
