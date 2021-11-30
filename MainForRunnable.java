
public class MainForRunnable {

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		
		Thread thread = new Thread(rd);
		thread.start();
		
		for (int i = 100; i < 110; i++) {
			System.out.println("I am executing by main thread: "+ i);
			
		}

	}

}
