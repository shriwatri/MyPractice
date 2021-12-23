
public class TwoStackByOneArray {
	
	int size;
	int top1,top2;
	int array[];
	//This is a constructor
	public TwoStackByOneArray(int size) {
		this.size = size;
		array = new int[size];
		top1 =-1;
		top2 =size;
	}
	
	private void push1(int x) {
		if(top1 < top2) {
		top1++;
		array[top1]=x;
		System.out.println("Push element into the stack1="+x);
		}else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		
	}
	
	private void push2(int x) {
		if(top1 < top2-1) {
			top2--;
			array[top2]=x;
			System.out.println("Pushed element to stack2="+x);
		}else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
		
	}
	
	private int pop1() {
		if(top1>=0) {
			int x = array[top1];
			System.out.println("Element popped="+x);
			top1--;
			return x;
		}else {
			System.out.println("System is underflow.");
			System.exit(1);
		}
		return 0;
	}
	
	
	
	private int pop2() {
		if(top2 < size) {
			int x = array[top2];
			System.out.println("Element popped="+x);
			top2--;
			return x;
		}else {
			System.out.println("System is underflow.");
			System.exit(1);
		}
		return 0;
	}
	
	

	public static void main(String[] args) {
		TwoStackByOneArray s = new TwoStackByOneArray(10);
		s.push1(10);
		s.push1(20);
		s.push1(30);
		s.pop1();
		s.push2(40);
		s.push2(50);
		s.push2(60);
		s.pop2();
		
		
	}

}
