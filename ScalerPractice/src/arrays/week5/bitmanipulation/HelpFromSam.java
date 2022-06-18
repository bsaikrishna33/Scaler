package arrays.week5.bitmanipulation;

public class HelpFromSam {

	public static int solve(int A) {
		int setBitCount = 0;

		while(A>0) {
			if((A&1)==1) {
				setBitCount++;
			}
			A=A>>1;
		}
		return setBitCount;
	}

	public static void main(String[] args) {
		System.out.println(solve(10));
	}
}
