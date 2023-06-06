package com.shriwatri;

public class MyFirstThread {

	public static void main(String[] args) {
		Task task = new Task();
		Thread thread = new Thread(task);
		thread.start();
		System.out.println("Insdie main...");
		try {
			Thread.sleep(3000);
			System.out.println("Insdie main after thread.sleep()...");
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Insdie main after sleep method...");
	}
}

class Task implements Runnable{

	@Override
	public void run() {
		System.out.println("Insdie run method..");
		go();
		
	}

	private void go() {
		System.out.println("Insdie go method..");
		more();
	}
	
	private void more() {
		System.out.println("Insdie more method..");
		
	}
	
}
