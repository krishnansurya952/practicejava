// package Arrays;
import java.util.*;


public class subArray {
    public static void solve(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i; j<arr.length;j++){
                
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " " );
                }
                System.out.print("\t\t");

            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int a[]={1,-2,6,-1,3};
        solve(a);
    }
    
}
