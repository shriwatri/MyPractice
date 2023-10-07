package com.shriwatri;

import java.util.Arrays;

public class TargetOfSumOfArrayInput {

	public static void main(String[] args) {
		int[] inupt = { 2, 3, 4, 5 };
		int target = 9;
		int[] output= solution(inupt, target);
		System.out.println(Arrays.toString(output));
		System.out.println("Direct sysout in calling method:");
		System.out.println("Arrays.toString(solution(inupt, target): "+Arrays.toString(solution(inupt, target)));

	}
	
	public static int[] solution(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("Output from sysout method: "+"[" + i + "," + j + "]");

					return new int[] { i, j };
					
				}
				break;
			}
		}

		return new int[] {};

	}

	

}
