
public class ThreadClass extends Thread {
	
	@Override
	public void run() {
		System.out.println("This is a Thread Class inside run method start --->");
		for(int i =0;i <10 ; i++) {
			System.out.println("Child Thread: "+ Thread.currentThread().getName()+"  "+i);
		}
	}

}
