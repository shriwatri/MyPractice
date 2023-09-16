package com.shriwatri;

class RunnableDemo implements Runnable{

	@Override
	public void run() {
		System.out.println("Runnable Demo....");
		
	}
	
}

public class RunnableMain {

	public static void main(String[] args) {
		RunnableDemo r = new RunnableDemo();
		Thread t = new Thread(r);
		t.start();
		

	}

}
