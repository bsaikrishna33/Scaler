package arrays.week3.carryforward;

public class AmazingSubarrays {

	 public static int solve(String A) {

	        int len=A.length()-1;
	      int amazingSbStringCount=0;
	        for(int i=0;i<=len;i++){

	            if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u' || 
	            A.charAt(i)=='A' || A.charAt(i)=='E' || A.charAt(i)=='I' || A.charAt(i)=='O' || A.charAt(i)=='U' ){
	               amazingSbStringCount+=len-i+1;
	            }
	        }
	        return amazingSbStringCount;
	    }
	 
	 public static void main(String[] args) {
		String A="ABEC";
		
		int count=solve(A);
		System.out.println("Count "+count);
	}
}
