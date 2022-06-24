package arrays.week6;

public class NthMagicNumber {

	public static int solve(int A) {
		int pow = 1, res = 0;

		while (A != 0) {
			pow = pow * 5;

			if ((int) (A & 1) == 1)
				res += pow;

			A >>= 1;
		}
		return res;
	}

	public static void main(String[] args) {

		int res = solve(5);
		System.out.println("res+++" + res);
	}
}
