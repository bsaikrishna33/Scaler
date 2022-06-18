package arrays.week6;

public class Minimum {

	public static int solve(int A, int B, int C) {
		int min = Math.min(A, (Math.min(B, C)));
		if (A == min) {
			min = min * 100 + Math.min(B, C);
			min = min * 100 + Math.max(B, C);
		} else if (B == min) {
			min = min * 100 + Math.min(A, C);
			min = min * 100 + Math.max(A, C);
		} else {
			min = min * 100 + Math.min(A, B);
			min = min * 100 + Math.max(A, B);
		}
		return min;
	}

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int C = 30;
		
		System.out.println(solve(A,B,C));
	}
}
