package basics;

public class ArmstrongNum {

	
	public static void main(String[] args) {
		
		int N=354;
		for(int i=1;i<N;i++){
		       int temp=0;
		         int num=i;
		         if(i==153) {
		        	 System.out.println("15333");
		         }
		       while(num>0){
		         int n=num%10;
		         temp+=n*n*n;
		          num=num/10;         
		       }
		       if(temp==i){
		           System.out.println(i);
		       }
		     }
		System.out.println("Done");
	}
}
