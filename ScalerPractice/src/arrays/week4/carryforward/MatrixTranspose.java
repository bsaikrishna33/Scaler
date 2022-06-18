package arrays.week4.carryforward;

public class MatrixTranspose {
	public static int[][] solve(int[][] A) {

		int rowLength = A.length;
		int colLength = A[0].length;
		int[][] res = new int[colLength][rowLength];

		for (int i = 0; i < colLength; i++) {
			for (int j = 0; j < rowLength; j++) {
				res[ i][j] = A[j][i];
			}

		}

		return res;
	}

	public static void main(String[] args) {
		int[][] A = { { 1, 2 },
				      { 1, 2 }, 
				      { 1, 2 } };
		
		int[][] response=solve(A);
		
		for(int i=0;i<response.length;i++) {
			for(int j=0;j<response[0].length;j++) {
				System.out.print(" "+response[i][j]);
			}
			System.out.println();
		}
	}
}
