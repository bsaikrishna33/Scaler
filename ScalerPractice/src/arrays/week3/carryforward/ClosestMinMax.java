package arrays.week3.carryforward;

public class ClosestMinMax {
	public static int solve(int[] A) {

		int len = A.length;
		int min = A[0];
		int max = A[0];
		for (int i = 1; i < len; i++) {
			if (A[i] < min) {
				min = A[i];
			} else if (A[i] > max) {
				max = A[i];
			}

		}
		int minIndex = -1;
		int maxIndex = -1;
		int minSubArray = len;
		for (int i = 0; i < len; i++) {

			if (A[i] == min) {
				minIndex = i;
				if (maxIndex != -1) {
					minSubArray = Math.min(minSubArray, Math.abs(maxIndex - minIndex) + 1);
				}
			}
			if (A[i] == max) {
				maxIndex = i;
				if (minIndex != -1) {
					minSubArray = Math.min(minSubArray, Math.abs(maxIndex - minIndex)+1);
				}
			}
		}
		return minSubArray;
	}

	public static void main(String[] args) {
		int[] A = { 834, 563, 606, 221, 165};
		int minSubArray=solve(A);
		System.out.println(minSubArray);
	}
}
