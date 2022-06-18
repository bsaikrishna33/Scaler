package arrays.week5.bitmanipulation;

public class ChristmasTrees {

	public static int solve(int[] A, int[] B) {

		int arrLength = A.length;
		int minCost = Integer.MAX_VALUE;
		for (int i = 1; i < arrLength - 1; i++) {

			Integer leftMin;
			Integer rightMin;

			leftMin = findLeftMin(i, A);
			rightMin = fintRightMin(i, A);
			if (leftMin != null && rightMin != null) {
				minCost = Math.min(minCost, B[leftMin] + B[i] + B[rightMin]);
			}
		}
		return minCost != Integer.MAX_VALUE ? minCost : -1;
	}

	public static int fintRightMin(int i, int[] A) {
		Integer rightMin = A[i];
		for (int j = i + 1; j < A.length; j++) {
			if (A[j] > A[j - 1]) {
				rightMin = A[j];
			}
		}
		return rightMin == A[i] ? null : rightMin;
	}

	public static Integer findLeftMin(int i, int[] A) {
		Integer leftMin = A[i];
		for (int j = i - 1; j >= 0; j--) {
			if (A[j] < A[j + 1]) {
				leftMin = A[j];
			}
		}
		return leftMin == A[i] ? null : leftMin;
	}

	public static void main(String[] args) {
		int []A = {1, 6, 4, 2, 6, 9};
		int[] B = {2, 5, 7, 3, 2, 7};
		System.out.println(solve(A,B));
	}
}
