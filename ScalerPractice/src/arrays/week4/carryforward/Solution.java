package arrays.week4.carryforward;

public class Solution {

	public static int maxSubArray(final int[] A) {

		int maxSubArray = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum = sum + A[i];

			maxSubArray = Math.max(maxSubArray, sum);
			if (sum < 0) {
				sum = 0;
			}

		}

		return maxSubArray;
	}

	public static void main(String[] args) {
		int[] A = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int result = maxSubArray(A);
		System.out.println(result);
	}

}