package arrays.week3.carryforward;

public class CountEvenOddIndex {

	public static int solve(int[] A) {
		int count = 0;
		int len = A.length;
		int[] evenSum = new int[len];
		int[] oddSum = new int[len];

		evenSum[0] = A[0];
		for (int i = 1; i < len; i++) {
			if (i % 2 == 0) {
				evenSum[i] = evenSum[i - 1] + A[i];
				oddSum[i] = oddSum[i - 1];
			} else {
				evenSum[i] = evenSum[i - 1];
				oddSum[i] = oddSum[i - 1] + A[i];
			}
		}

		for (int i = 0; i < len; i++) {

			int even = 0;
			int odd = 0;
			if (i != 0) {
				even = evenSum[i - 1] + oddSum[len - 1] - oddSum[i ];
				odd = oddSum[i - 1] + evenSum[len - 1] - evenSum[i];
			} else {
				even = oddSum[len - 1]-oddSum[0];
				odd = evenSum[len - 1]-evenSum[0];
			}
			if (even == odd) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] A = { 2, 1, 6, 4 };
		System.out.println(solve(A));
	}

}
