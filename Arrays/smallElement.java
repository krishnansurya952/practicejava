// package Arrays;
import java.util.*;

public class smallElement {
    public static int smallNumber(int arr[]){
        int smallest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
            int a[]={7,2,9,45,1,74,0};
            int res=smallNumber(a);
            System.out.println("Small Element: " + res);
        }
    
















    // public static int smallNumber(int arr[]){
    //     int min=Integer.MAX_VALUE;
    //     for(int i=0;i<=arr.length-1;i++){
    //         if(arr[i]<min){
    //             min=arr[i];
    //         }
    //     }

    //     return min;
    // }
    // public static void main(String args[]){
    //     int a[]={7,2,9,45,1,74};
    //     int res=smallNumber(a);
    //     System.out.println("Small Element: " + res);
    // }
    
}
