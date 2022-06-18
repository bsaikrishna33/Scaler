package arrays.week4.carryforward;

public class MatrixMultiplication {

	public static int[][] solve(int[][] A, int[][] B) {

		int row1 = A.length;
		int col1 = A[0].length;
		int row2 = B.length;
		int col2 = B[0].length;

		int matrix[][] = new int[row1][col2];
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++) {
				for (int k = 0; k < row2; k++) {
					matrix[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return matrix;
	}

	public static void main(String[] args) {

		int[][] A = {{ 62, -37, -49, 18, -53, 14, 51},
				  {62, -52, -11, -21, -62, -44, -95},
						  {20, 78, -29, -49, -17, 21, 83},
						  {-99, -69, -39, -47, 19, -50, -90},
						  {91, -96, 63, -23, 5, 94, 49},
						  {17, 1, 16, 63, -78, -13, -100},
						  {-7, 72, 16, 86, -53, 94, 85},
						  {-82, 78, 96, -45, -42, 38, 34},
						  {-88, 37, 12, 31, -91, 51, 23}
								  };
		int[][] B = {{ 90, 68, 2, 54, -59},
				  {78, -86, 8, -30, 24},
						  {-92, 84, -62, 13, 2},
						  {12, -73, -53, -91, -4},
						  {74, 85, -51, -4, 37},
						  {-30, -27, 10, -78, 29},
						  {-96, 39, -42, 93, 78},
						  };
		int[][] res=solve(A,B);
	
		int row=res.length;
		int col=res.length;
		
    for(int i=0;i<row;i++) {
    	for(int j=0;j<col;j++) {
    	  System.out.print(" "+res[i][j]);	
    	}
    	System.out.println();
    }		
		
	}

}
