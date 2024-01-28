package com.shriwatri.prefixsum;

public class PrefixSumContinousB {
	public static void main(String[] args) {
		int[] A = {5, -2, 3 , 1, 2};
		System.out.println(solve(A, 3));
		
	}
	
	public static int solve(int[] A, int B) {
        int N = A.length;
        int ans = 0;
        int sum = 0;
        if(B == 0){
            return 0;
        }
        //Prefix sum
        int[] pSum = new int[N];
        pSum[0] = A[0];
        for(int i = 1; i < N; i++){
            pSum[i] = pSum[i-1]+A[i];
        }
        //Sufix Sum
        int[] sSum = new int[N+1];
        sSum[N-1] = A[N-1];
        for(int i = N-2; i >= 0; i--){
            sSum[i] = sSum[i+1]+A[i];
        }

        ans = Math.max(pSum[B-1], sSum[N-B]);

        for(int i = 1; i < B; i++){
            sum = pSum[i-1]+sSum[N-(B-i)];
            ans = Math.max(ans,sum);
        }
        return ans;
    }

}
