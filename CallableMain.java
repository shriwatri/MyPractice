package com.shriwatri;

import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableDemo implements Callable<Long>{
	int num;
	
	public CallableDemo(int num) {
		super();
		this.num = num;
	}



	@Override
	public Long call() throws Exception {
		long fact = 1;
		for(int count=num; count > 1; count--) {
			fact*=count; // fact= fact*count;
		}
		return fact;
	}
	
}

public class CallableMain {
	
	

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number for factorial:");
		int num =scn.nextInt();
		CallableDemo cd = new CallableDemo(num);
		ExecutorService executor = Executors.newFixedThreadPool(num);
		Future<Long> result = executor.submit(cd);
		System.out.println(result.get());
		executor.shutdown();
		
		

	}

}
