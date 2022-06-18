package arrays.week6;

public class ModString {

	public static int findMod(String A, int B) {
		long number = 0L;
		int n = A.length() - 1;
		long unit = 1L;
		while (n >= 0) {
			long temp = ((A.charAt(n) - '0') * unit) % B;
			number = (number + (temp % B)) % B;
			unit = (unit * 10) % B;
			n--;
		}

		long res = (number % B);
		return (int) res;

	}

	public static void main(String[] args) {

		// int num=842554936302263;
		String A = "143";
		int B = 2;
		int res = findMod(A, B);
		System.out.println("res " + res);
	}
}
