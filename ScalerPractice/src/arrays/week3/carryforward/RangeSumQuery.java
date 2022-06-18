package arrays.week3.carryforward;

public class RangeSumQuery {

	public static long[] rangeSum(int[] A, int[][] B) {
		long[] count = new long[B.length];

		int len = A.length;
		int[] prefixSum = new int[len];

		for (int i = 0; i < len; i++) {
			if (i == 0) {
				prefixSum[i] = A[i];
			} else {
				prefixSum[i] = prefixSum[i - 1] + A[i];
			}
		}

		for (int i = 0; i < B.length; i++) {
			int right = B[i][1] - 1;
			int left = B[i][0] - 1;
			int sum = 0;
			if (left != 0) {
				sum = prefixSum[right] - prefixSum[left-1];
			} else {
				sum = prefixSum[right];
			}
			count[i] = sum;
		}

		return count;
	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3, 4, 5 };
		int[][] B = { { 1, 4 }, { 2, 3 } };
		long[] res = rangeSum(A, B);
		System.out.println(res);

	}
}
