package arrays.week5.bitmanipulation;

public class SumBinary {

	public static String sum(String A, String B) {
		StringBuffer str = new StringBuffer();

		int aLen = A.length() - 1;
		int bLen = B.length() - 1;

		int sum = 0;
		while (aLen >= 0 || bLen >= 0 || sum==1) {

			sum += aLen >= 0 ? A.charAt(aLen) - '0' : 0;
			sum += bLen >= 0 ? B.charAt(bLen) - '0' : 0;

			str.append((char) (sum % 2 + '0'));
			sum = sum / 2;
			aLen--;
			bLen--;
		}

		return str.reverse().toString();
	}

	public static void main(String[] args) {

		String A = "100";
		String B = "11";
		String res = sum(A, B);
		System.out.println(res);
	}
}
