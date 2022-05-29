package arrays;
import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
   
   int largest=0;
   int second=0;
   int prev=0;
   
   int arr[]=new int[3];
   Scanner sc=new Scanner(System.in);
   for(int i=0;i<=arr.length;i++)
   {
       arr[i]=sc.nextInt();
   }
   int len=arr.length;
   if(len==1){
                System.out.println("-1");
            }
   else{
        largest=arr[0];
       for(int i=0;i<len;i++)
       {
         prev=largest;
         if(arr[i]>=largest)
         {
                largest=arr[i];
                second=prev;
         }
       }
       
System.out.println(second);

                }

}

}
