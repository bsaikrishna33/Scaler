package arrays;

public class EquilibriumIndex {
	public static int solve(int[] A) {

		int len = A.length;

		int leftSum[] = new int[len];
		int rightSum[] = new int[len];

		leftSum[0] = A[0];
		for (int i = 1; i < len; i++) {
			leftSum[i] = A[i] + leftSum[i - 1];
		}
		rightSum[len - 1] = A[len - 1];
		for (int j = len - 2; j >= 0; j--) {
			rightSum[j] = A[j] + rightSum[j + 1];
		}

		for (int k = 0; k < len; k++) {
			if (leftSum[k] == rightSum[k]) {
				return k;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] A = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println("EqilibriumIndex+++++"+solve(A));
	}
}
