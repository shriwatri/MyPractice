package com.shriwatri;

public class InsertArrayElement {
	int count =0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int a[] = new int[5];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		a[4] = 5;
		InsertArrayElement o = new InsertArrayElement();
		
		for(int j = 0; j < a.length; j++) {
			o.insert(a, j);
		}
		
		
		print(a);
		System.out.println("Insert element in array start:");
		o.insertAtStart(a, 34);
		o.insertAtStart(a, 55);
		print(a);
		System.out.println("Insert element in array position:");
		o.insertAtPosition(a, 50, 3);
		print(a);
		

	}

	/**
	 * @param a
	 */
	private static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
			
		}
	}
	
	public void insert(int a[], int value) {
		a[count++] = value;
	}
	
	public void insertAtStart(int a[] , int value) {
		for(int i = count-1; i >0 ; i-- ) {
			a[i] = a[i-1];
		}
		a[0] =value;
	}

	public void insertAtPosition(int a[], int value, int position) {
		//Loop for shifting elements
		for (int i = count-1; i > position; i--) {
			a[i] =a[i-1];
		}
		a[position] =value;
		
	}
}
