import java.util.Stack;

public class ReverseStrings {

	public static void main(String[] args) {
		reverseString("Hello World");

	}

	public static void reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i < str.length(); i++) {
			if(str.charAt(i)!=' ') {
				stack.push(str.charAt(i));
			}else {
				while(stack.empty()==false) {
					System.out.println(stack.pop());
					
				}
			}
		}
		System.out.println(" ");
		
		while(stack.empty()==false) {
			System.out.println(stack.pop());
		}
	}
	

}
