package arrays;

import java.util.ArrayList;
import java.util.List;

public class Multipleleft {

	public static int[][] solve(int[] A, int[] B) {
		int len = A.length;
		int bLen = B.length;
		int[][] res = new int[bLen][len];

		for (int i = 0; i < bLen; i++) {
			int[] leftRotate = new int[len];
			int index = 0;
			for (int j = B[i]; j < len + B[i]; j++) {
				leftRotate[index++] = A[j % len];
			}

			res[i] = leftRotate;
		}
		  

		return res;
	}

	public static void main(String[] args) {
		int[] A = { 6, 31, 33, 13, 82, 66, 9, 12, 69, 21, 17, 2, 50, 69, 90, 71, 31, 1, 13, 70, 94, 46, 89, 13, 55, 54,
				67, 97, 28, 27, 62, 34, 41, 18, 15, 35, 13, 84, 93, 27, 89, 23, 6, 56, 94, 40, 54, 95, 47 };
		int[] B = { 88, 85, 98, 36, 66, 40, 30, 26, 51, 77, 62, 60, 92, 64, 53, 86, 24, 53, 85, 49, 57, 29, 32, 60, 75,
				82, 17, 23, 67, 51, 23, 11, 70, 59 };
		int res[][] = solve(A, B);

		int row = res.length;
		int col = res[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(" " + res[i][j]);
			}
			System.out.println();
		}
	}
}
