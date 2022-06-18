package arrays.week4.carryforward;

public class SumofAllSubarrays {

	public static long subarraySum(int[] A) {

		long ans = 0;
		int n = A.length;
		for (int i = 0; i < n; i++)
			ans += (long) A[i] * (i + 1) * (n - i);
		return ans;
	}

	public static void main(String[] args) {

		int[] A = { 1, 2, 3 };
		System.out.println("subarraySum" + subarraySum(A));
	}
}