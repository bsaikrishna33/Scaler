package basics;

    

public class PerfectSqure {

	 public static int solve(int A) {

		 //38187812*38187812=84630800
	       for(long i=1;i<=A;i++){
	          
	          if((i*i)==A){
	            return (int)i;
	          }
	       } 
	       return -1;
	    }
	 
	public static void main(String[] args) {
		
		
	System.out.println(solve(84630800));	
	}
}
