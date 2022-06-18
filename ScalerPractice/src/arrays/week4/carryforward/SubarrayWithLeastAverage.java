package arrays.week4.carryforward;

public class SubarrayWithLeastAverage {
	public static int solve(int[] A, int B) {
		int minSum = Integer.MAX_VALUE;
		int len = A.length;
		int startIndex = 0;
		int prevSum = Integer.MAX_VALUE;
		for (int i = 0; i <=len - B; i++) {
			int subArraySum = 0;

			for (int j = i; j < i + B; j++) {
				subArraySum += A[j];
			}
			if (subArraySum < minSum && prevSum != subArraySum) {
				startIndex = i;
				minSum = subArraySum;
			}
			prevSum = subArraySum;

		}

		return startIndex;
	}

	public static void main(String[] args) {
		int[] A = { 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11  };
		int B = 9;

		System.out.println(solve(A, B));
	}
}
