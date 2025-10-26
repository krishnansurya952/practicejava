// package Arrays;
import java.util.*;

public class sumOFArr {
    public static int solve(int arr[],int sum){
        int n=arr.length-1;

        for(int i=0;i<=n;i++){
            sum+=arr[i];
        }
        return sum;

    }

    public static void main(String args[]){
            int a[]={2,3,4,5,6,7,8,9};
            int res=solve(a,0);
            System.out.println(Arrays.toString(a));
            System.out.println("Total Sum : "+res);
    }











    // public static void main(String args[]){
    //     int a[]={2,3,4,5,6,7,8,9};
    //     int sum=0;
    //     for(int i=0;i<=a.length-1;i++){
    //         sum=sum+a[i];
    //     }
    //     System.out.println(Arrays.toString(a));

    //     System.out.println("Total Sum: "+sum);
    // }
    
}
