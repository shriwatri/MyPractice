package schedular.com.project;

public class Example {
	public static void main(String args[]) {
		try {
			int a[] = new int[10];
			a[10] = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception in first catch block");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds in second catch block");
		} catch (Exception e) {
			System.out.println("Any exception in third catch block");
		}
	}
}
