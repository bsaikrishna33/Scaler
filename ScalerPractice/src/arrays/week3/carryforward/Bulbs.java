package arrays.week3.carryforward;

public class Bulbs {
	  public int bulbs(int[] A) {
	        int len=A.length;
	        int switchFlipCount=0;

	        for(int i=0;i<len;i++){
	            if(switchFlipCount%2==0 && A[i]==0){
	                switchFlipCount++;
	            }    
	            if(switchFlipCount%2!=0 && A[i]==1){
	                switchFlipCount++;
	            }
	        }
	        return switchFlipCount;
	        }

}
