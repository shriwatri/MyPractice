package com.shriwatri.prefixsum;

public class PrefixSumBruteForce {

	public static void main(String[] args) {
		int[][] B = {{1, 2}, {2, 3}, {2, 5}};
		int[] A = {3,5,-5,6,1,2,3};
		querySum(B, A, B.length);

	}
	
	public static void querySum(int[][] B,int[] A, int querySize) {
		for(int i =0; i < querySize; i++) {
			int L = B[i][0];
			int R = B[i][1];
			int sum = 0;
			for(int j = L; j <= R; j++) {
				sum += A[j];
			}
			System.out.println(sum);
		}
		
	}

}
