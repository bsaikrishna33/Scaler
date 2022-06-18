package arrays.week4.carryforward;

public class SpiralOrderMatrix {

	public static int[][] generateMatrix(int A) {

		int matrix[][] = new int[A][A];
		int dir = 1;
		int left = 0, top = 0, right = A - 1, bottom = A - 1;
		int n = 1;
		while (left <= right && top <= bottom) {

			if (dir == 1) {
				for (int i = left; i <= right; i++) {
					matrix[top][i] = n++;
				}
				top++;
				dir = 2;
			} else if (dir == 2) {
				for (int i = top; i <= bottom; i++) {
					matrix[i][right] = n++;
				}
				right--;
				dir = 3;
			} else if (dir == 3) {
				for (int i = right; i >= left; i--) {
					matrix[bottom][i] = n++;
				}
				bottom--;
				dir = 4;
			} else if (dir == 4) {
				for (int i = bottom; i >= top; i--) {
					matrix[i][left] = n++;
				}
				left++;
				dir = 1;
			}
		}
		return matrix;

	}

	public static void main(String[] args) {

		int[][] matrix = generateMatrix(2);
		int n = matrix.length;
		int m = matrix[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
}
