package basics;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
public class PerfectNumber {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
         List<Integer> list=new ArrayList<>();
        for(int i=1;i<N;i++){
           if(N%i==0){
               list.add(i);
           }
        }
       int sum=0;
        for(int i:list){
           sum+=i;
        }

        if(sum==N){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}