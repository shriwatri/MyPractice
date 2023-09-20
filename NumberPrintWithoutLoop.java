package com.shriwatri;

import java.util.stream.IntStream;

public class NumberPrintWithoutLoop {
	static int i = 1;

	public static void main(String[] args) {
		//1 st approach
		
//		if( i <= 100) {
//			System.out.printf("%d ",i++);
//			main(null);
//		}
		//printNum(1);
		printNumber(2,20);
		//IntStream.range(1, 10).forEach(e -> System.out.println(e));

	}
	
	//2nd approach
	public static void printNum(int num) {
		if(num <= 100) {
			System.out.println(num);
			num++;
			printNum(num);
		}
	}
	
	//3rd approach
	public static void printNumber(int startNum,int endNum) {
		if(startNum <= endNum) {
			System.out.println(startNum);
			startNum++;
			printNumber(startNum,endNum);
		}
	}
   
}
