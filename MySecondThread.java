package com.shriwatri;

public class MySecondThread extends Thread{
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

	public static void main(String[] args) {
		Thread myThread = new MySecondThread();
		myThread.start();
		System.out.println("Inside Main method extending thread class....");

	}

}
