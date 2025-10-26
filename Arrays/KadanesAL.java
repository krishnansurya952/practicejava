// package Arrays;
import java.util.*;

public class KadanesAL {
    public static void solve(int a[]){
        int pre[]=new int [a.length];
        pre[0]=a[0];

        int max=Integer.MIN_VALUE;
        for(int i=1;i<pre.length;i++){
            pre[i]=a[i-1]+a[i];// index=2 pre[2]=a[1]-a[2]

        }
        //! kadanes algorithm
        for(int i=0;i<a.length;i++){// i=1
            for(int j=i;j<a.length;j++){
                int cs=(i==0)?pre[j]:pre[i-1];
                if(cs>max){
                    max=cs;
                }
            }
        }
        System.out.println(Arrays.toString(pre));
        System.out.println("MAx sum is: "+max);
    }
    public static void main(String args[]){
        int a[]={1,-2,6,-1,3};
        System.out.println(Arrays.toString(a));
        solve(a);
    }
    
}
