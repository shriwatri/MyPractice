import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string");
		String str =scn.nextLine(); // "Rajesh";//
		String rev = "";
		
		//1. By using String concatenation
//		int len = str.length();
//		
//		for(int i = len-1; i >=0 ;i--) {
//			rev =rev+ str.charAt(i);
//		}
//		
//	System.out.println("Reverse String is: "+rev);	
		
		//2nd Approach using character array
		/*char a[] = str.toCharArray();
		int len = a.length;
		for(int i = len-1; i >=0; i--) {
			rev = rev+a[i];
		}
		System.out.println("Reverse String is: "+rev);	*/
		
		//3. Using String Buffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse value is using String Buffer: "+sb.reverse());
	}

}
