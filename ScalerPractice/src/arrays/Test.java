package arrays;

public class Test {

	//Using AP
	public static int solve(int[] A) {

		int len = A.length;

		int min = A[0];
		int max = A[0];
		for (int i = 0; i < len; i++) {
			if (min > A[i]) {
				min = A[i];
			}
			if(max<A[i]) {
				max=A[i];
			}
		}

		int res1 = 0, res2 = 0;
		int len2 = (max - min) + 1;
		for (int i = 0; i < len2; i++) {
			res1 = res1 ^ min;
			min++;
		}
		for (int i = 0; i < len; i++) {
			min=Math.min(min, A[i]);
			res2 = res2 ^ A[i];
			
		}
		if ((res1 ^ res2) == 0) {
			return 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] A = {50,48,44,47,45,46,49  };
		System.out.println(solve(A));
	}
}
