import java.util.Stack;

public class ParenthisChecker {

	public static void main(String[] args) {
		String str = "{{(})}}";
		Stack<Character> st = new Stack<Character>();
		for(int i =0; i < str.length() ; i++) {
			char ch=str.charAt(i);
			if(st.empty()) {
				st.push(ch);
			}else if(ch=='{' || ch=='(' || ch=='['){
				st.push(ch);
			}else if(ch=='}' && st.peek()=='{') {
				st.pop();
			}else if(ch==')' && st.peek()=='(') {
				st.pop();
			}else if(ch==']' && st.peek()=='[') {
				st.pop();
			}else {
				//System.out.println("Given string is not well formed");
				st.push(ch);
			}
		}
		if(st.isEmpty()) {
			System.out.println("Given string is well formed");
		}else {
			System.out.println("Given string is not well formed");
		}

	}

}
