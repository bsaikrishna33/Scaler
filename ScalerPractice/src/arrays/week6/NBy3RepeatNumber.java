package arrays.week6;

public class NBy3RepeatNumber {

	public static int repeatedNumber(int[] A) {

		int count1 = 0, count2 = 0;
		int len = A.length;
		int first = Integer.MAX_VALUE;
		int second = Integer.MIN_VALUE;
		for (int i = 0; i < len; i++) {

			if (A[i] == first) {
				count1++;
			} else if (A[i] == second) {
				count2++;
			} else if (count1 == 0) {
				first = A[i];
				count1 = 1;
			} else if (count2 == 0) {
				second = A[i];
				count2 = 1;
			} else {
				count1--;
				count2--;
			}
		}
		count1 = 0;
		count2 = 0;

		for (int i = 0; i < len; i++) {
			if (A[i] == first) {
				count1++;
			} else if (A[i] == second) {
				count2++;
			}
		}

		if (count1 > len / 3) {
			return first;
		} else if (count2 > len / 3) {
			return second;
		}
		return -1;

	}

	public static void main(String[] args) {
		int[] A = { 1, 1, 1, 2, 3, 5, 7 };
		int res = repeatedNumber(A);
		System.out.println("res++++ " + res);
	}
}
