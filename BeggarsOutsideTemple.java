package com.shriwatri.prefixsum;

import java.util.Arrays;

public class BeggarsOutsideTemple {
	public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};

        int[] result = distributeCoins(A, B);
        System.out.println(Arrays.toString(result));
    }

    public static int[] distributeCoins(int A, int[][] B) {
        int[] beggars = new int[A];

        for (int i = 0; i < B.length; i++) {
            int leftIndex = B[i][0] - 1; // 0-based indexing
            int rightIndex = B[i][1] - 1;
            int coins = B[i][2];

            beggars[leftIndex] += coins;

            if (rightIndex + 1 < A) {
                beggars[rightIndex + 1] -= coins;
            }
        }

        // Update each beggar's pot by accumulating the contributions
        for (int i = 1; i < A; i++) {
            beggars[i] += beggars[i - 1];
        }

        return beggars;
    }
}
