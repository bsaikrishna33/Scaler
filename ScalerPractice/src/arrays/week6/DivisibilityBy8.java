package arrays.week6;

public class DivisibilityBy8 {

	public static int solve(String A) {

		int size = A.length();
		int i = size - 1;
		int number = 0;
		int unit = 1;
		while (size >= 0) {
			number = (A.charAt(i) - '0') * unit + number;
			unit = unit * 10;
		}

		if (number % 8 == 0)
			return 1;

		return 0;

	}

	public static void main(String[] args) {

		int res = solve("8");
		System.out.println("res++++" + res);
	}
}
