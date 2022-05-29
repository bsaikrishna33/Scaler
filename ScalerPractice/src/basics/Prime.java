package basics;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int c = 0;
		for (int i = 1; i <=A; i++) {
			if (A % i == 0) {
				c++;
			}
		}

		if (c == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
