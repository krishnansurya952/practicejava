// Your task is to complete a function “count_heads()” that takes two inputs N and R. The function should return the probability of getting 
// exactly R heads on N successive tosses of a fair coin. A fair coin has an equal probability of landing a head or a tail (i.e. 0.5) on each toss.

// Example 1

// Input: 1 1
// Output: 0.500000
// Example 2

// Input: 4 3
// Output: 0.250000
import java.util.*;

public class prog1{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static double count_heads(int n,int r){
        int i=1;
        double res;
        res=fact(n)/(fact(r)*fact(n-r));
        System.out.println(i+++" res "+res+" \tn:"+n);
        res=res/(Math.pow(2,n));
        System.out.println(i+++" res "+res);
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("finall:"+count_heads(n,r));


    }
}