package arrays.week4.carryforward;

public class RotateMatrix {
	public static void solve(int[][] A) {

		// Step 1: Transpose matrix
		// Step 2: Reverse each row

		int rowLength = A.length;
		int colLength = A[0].length;

		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				if (i == j) {
					break;
				}
				int temp = A[i][j];
				A[i][j] = A[j][i];
				A[j][i] = temp;
			}

		}

		for (int i = 0; i < rowLength; i++) {
			int left = 0;
			int right = colLength - 1;
			while (left < right) {
				int temp = A[i][right];
				A[i][right] = A[i][left];
				A[i][left] = temp;

				left++;
				right--;
			}
		}

	}

	public static void main(String[] args) {
		int[][] A = { { 1, 2 }, { 3, 4 } };
		solve(A);
		int rowLength = A.length;
		int colLength = A[0].length;

		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < colLength; j++) {
				System.out.print(" " + A[i][j]);
			}
			System.out.println();
		}
	}
}
