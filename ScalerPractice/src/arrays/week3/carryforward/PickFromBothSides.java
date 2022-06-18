package arrays.week3.carryforward;

public class PickFromBothSides {

	public static int solve(int[] A, int B) {

		int maxSum = 0;
		int currentSum = 0;
		for (int i = 0; i < B; i++) {
			currentSum += A[i];
		}

		maxSum = currentSum;
		int right = A.length - 1;
		int left = B - 1;
		while (right >= 0 && left >= 0) {
			currentSum += A[right--];
			currentSum -= A[left--];
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int[] A = { 5, -2, 3, 1, 2 };
		int B = 3;
		int res=solve(A,B);
		System.out.println("Result++  "+res);
	}
}
