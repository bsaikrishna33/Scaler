package arrays.week7;

import java.util.Arrays;

public class NobleInteger {

	public static int solve(int[] A) {

		Arrays.sort(A);
		int count = 0;

		int len = A.length;
		if (A[len - 1] == 0) {
			return 1;
		}
		for (int i = len - 2; i >= 0; i--) {
			if (A[i + 1] != A[i])
				count = len - 1 - i;
			if (A[i] == count)
				return 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		int[] A = { 3, 2, 1, 3 };
		System.out.println(solve(A));

	}
}
