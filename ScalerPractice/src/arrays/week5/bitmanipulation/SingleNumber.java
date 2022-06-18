package arrays.week5.bitmanipulation;

public class SingleNumber {

	public static int singleNumber(final int[] A) {

		int singleNumber = 0;
		for (int i = 0; i < A.length; i++) {
			singleNumber = singleNumber ^ A[i];
		}
		return singleNumber;
	}

	public static void main(String[] args) {

		int[]  A = {1, 2, 2, 3, 1};
		int res=singleNumber(A);
		System.out.println(res);
	}

}
