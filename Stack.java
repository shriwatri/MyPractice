
public class Stack {
	int array[] = new int[5];
	int top = 0;
	
	private boolean push(int x) {
		top++;
		array[top]=x;
		System.out.println("Element pushed into the stack: "+x);
		return true;
	}
	
	private int pop() {
		int x = array[top--];
		System.out.println("Element pop from the stack= "+x);
		return x;
	}
	
	private int peek() {
		return array[top];
	}
	

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Peek element in stack is: "+stack.peek());
		stack.pop();
		System.out.println("Peek element in stack is: "+stack.peek());
		

	}

}
