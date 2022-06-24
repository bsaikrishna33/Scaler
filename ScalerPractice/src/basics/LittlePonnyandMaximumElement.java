package basics;

public class LittlePonnyandMaximumElement {

	 public int solve(int[] A, int B) {
	   int count=0; 
	 
	   int len=A.length;
	   
	   for(int i=0;i<len;i++) {
		   if(A[i]>B) {
			   count++;
		   }
	   }
	   
	   if(count>0) {
		   return count;
	   }
	   
	   return -1;
	 }
	 
	 public static void main(String[] args) {
		
	}
}
