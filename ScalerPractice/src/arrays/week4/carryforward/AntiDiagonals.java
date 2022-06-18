package arrays.week4.carryforward;

public class AntiDiagonals {

	public static int[][] diagonal(int[][] A) {
		int rowLength = A.length;
		int colLength = A[0].length;
		int res[][] = new int[rowLength + rowLength - 1][colLength];

		for (int i = 0; i < colLength; i++) {

			int rowIndex = 0, colIndex = i;
			int j = 0;
			while (rowIndex < rowLength && colIndex >= 0) {
				res[i][j++] = A[rowIndex][colIndex];
				rowIndex++;
				colIndex--;
			}
		}
		int row = rowLength;
		for (int i = 1; i < rowLength; i++) {

			int rowIndex = i, colIndex = colLength - 1;
			int j = 0;
			while (rowIndex < rowLength && colIndex >= 0) {
				res[row][j++] = A[rowIndex][colIndex];
				rowIndex++;
				colIndex--;
			}
			row++;
		}

		return res;
	}

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		diagonal(A);
	}
}
