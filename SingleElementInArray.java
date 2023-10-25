package com.shriwatri;

public class SingleElementInArray {

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,4,5,2,3,6};
		int output =singleNumber(arr);
		System.out.println(output);
		

	}
	public static int singleNumber(int nums[]) {
		int sing = nums[0];
		for (int i = 1; i < nums.length; i++) {
			sing = sing ^ nums[i];
			
		}
		return sing;
	}

}
