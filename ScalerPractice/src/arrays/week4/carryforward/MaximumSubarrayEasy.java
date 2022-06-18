package arrays.week4.carryforward;

public class MaximumSubarrayEasy {

	public static int maxSubarray(int A, int B, int[] C) {
		int maxSubarray = 0;

		for (int i = 0; i < A; i++) {
			int subArraySum = 0;
			int j = i;
			while (subArraySum <= B && j < A) {
				if (subArraySum + C[j] > B) {
					break;
				}
				subArraySum += C[j];
				j++;
			}
			maxSubarray = Math.max(subArraySum, maxSubarray);
		}

		return maxSubarray;
	}

	public static void main(String[] args) {
		int A = 5;
		int B = 12;
		int[] C = { 2, 1, 3, 4, 5 };
		
		int maxSubarraySum=maxSubarray(A,B,C);
		
		System.out.println(maxSubarraySum);
		
	}
}
