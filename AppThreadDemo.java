
public class AppThreadDemo {
	
	public static void main(String[] args) {
		ThreadClass tc = new ThreadClass();
		tc.start();
		System.out.println("This is a main class");
		for(int i =0;i <10 ; i++) {
			System.out.println("Main Thread for loop:"+ i + Thread.currentThread().getName());
		}
	}

}
