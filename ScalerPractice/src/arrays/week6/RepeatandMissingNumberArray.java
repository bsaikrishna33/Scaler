package arrays.week6;

public class RepeatandMissingNumberArray {
	public static int[] repeatedNumber(final int[] A) {

		int[] res = new int[2];

		int len = A.length;

		long S = (len * (len + 1)) / 2;
		long P = (len * (len + 1) * (2 * len + 1)) / 6;
		long missingNumber = 0, repeating = 0;

		for (int i = 0; i < len; i++) {
			S -= A[i];
			P -= A[i] * A[i];
		}

		missingNumber = (S + P / S) / 2;

		repeating = missingNumber - S;
		res[0] = (int) repeating;
		res[1] = (int) missingNumber;
		return res;
	}

	public static void main(String[] args) {
		int[] A = { 3, 1, 2, 5, 3 };

		int[] res = repeatedNumber(A);
		System.out.println("Res " + res);
	}
}
