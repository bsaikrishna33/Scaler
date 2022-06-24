package arrays.week6;

public class MajorityElement {

	public int majorityElement(final int[] A) {

		int n = A.length;

		int count = 1;
		int voting = A[0];

		for (int i = 1; i < n; i++) {

			if (count == 0) {
				voting = A[i];
				count = 1;
			} else if (voting == A[i]) {
				count++;
			} else {
				count--;
			}
		}

		return voting;
	}
}
