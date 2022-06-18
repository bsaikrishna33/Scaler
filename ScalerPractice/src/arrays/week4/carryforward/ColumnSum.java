package arrays.week4.carryforward;

public class ColumnSum {

	public static int[] solve(int[][] A) {
		int rowLength = A.length;
		int colLength = A[0].length;
		int colSum[] = new int[colLength];

		for (int column = 0; column < colLength; column++) {
			int sum = 0;
			for (int row = 0; row < rowLength; row++) {
				sum += A[row][column];
			}
			colSum[column] = sum;
		}

		return colSum;
	}

	public static void main(String[] args) {

		int[][] A = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 2, 3, 4 } };

		int res[] = solve(A);
		System.out.println("res  " + res);

	}
}
