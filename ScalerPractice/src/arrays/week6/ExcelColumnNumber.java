package arrays.week6;

public class ExcelColumnNumber {
	public int titleToNumber(String A) {
		int colNum = 0;

		int len = A.length() - 1;
		int unit = 1;
		while (len >= 0) {
			colNum = (((A.charAt(len) - 'A') + 1) * unit) + colNum;
			unit *= 26;
			len--;
		}
		return colNum;
	}
}
