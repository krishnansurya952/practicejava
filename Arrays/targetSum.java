import java.util.*;
/*
 * input=rr[]={8,1,2,9,6,5,16,4}
 * target=10
 *  8 - 2
    1 - 9
    6 - 4
 */

public class targetSum {
    public static void target(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" - " +arr[j]);
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[]={8,1,2,9,6,5,16,4};
        System.out.println(Arrays.toString(arr));
        target(arr,10);
    }
    
}
