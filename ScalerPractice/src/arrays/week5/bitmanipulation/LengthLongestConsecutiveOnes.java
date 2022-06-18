package arrays.week5.bitmanipulation;

public class LengthLongestConsecutiveOnes {

	public static int solve(String A) {

		int maxOnes = 0;
		int totalOneCount = 0;
		int n = A.length();
		int currentOneCount = 0;
		int prefix[] = new int[n];
		int sufix[] = new int[n];

		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '1') {
				totalOneCount += 1;
				currentOneCount += 1;
			}
			if (A.charAt(i) == '0') {
				currentOneCount = 0;
			}
			maxOnes = Math.max(maxOnes, currentOneCount);
		}

		for (int i = 0; i < n; i++) {
			if (A.charAt(i) == '0') {
				prefix[i] = 0;
			}
			if (A.charAt(i) == '1') {
				if (i == 0) {
					prefix[i] = 1;
				} else {
					prefix[i] = prefix[i - 1] + 1;
				}
			}
		}

		for (int i = n - 1; i >= 0; i--) {
			if (A.charAt(i) == '0') {
				sufix[i] = 0;
			}
			if (A.charAt(i) == '1') {
				if (i == n - 1) {
					sufix[i] = 1;
				} else {
					sufix[i] = sufix[i + 1] + 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			int extraOneCOunt = 0;
			int currentMaxOnes = 0;
			if (A.charAt(i) == '0') {
				if (i == 0) {
					extraOneCOunt = totalOneCount - sufix[i + 1];
					currentMaxOnes = (extraOneCOunt > 0 ? 1 : 0) + sufix[i + 1];
				} else if (i == n - 1) {
					extraOneCOunt = totalOneCount - prefix[i - 1];
					currentMaxOnes = prefix[i - 1] + (extraOneCOunt > 0 ? 1 : 0);
				} else {
					extraOneCOunt = totalOneCount - (prefix[i - 1] + sufix[i + 1]);
					currentMaxOnes = prefix[i - 1] + (extraOneCOunt > 0 ? 1 : 0) + sufix[i + 1];
				}
			}
			maxOnes = Math.max(maxOnes, currentMaxOnes);
		}
		return maxOnes;
	}

	public static void main(String[] args) {

		String A = "11101";
		int res = solve(A);
		System.out.println("res " + res);
	}
}
