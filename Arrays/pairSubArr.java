import java.util.*;
/*
 * input :  {2,6,8,10,14}
 * output:  (2,6)  (2,8)  (2,10)  (2,14)  
            (6,8)  (6,10)  (6,14)
            (8,10)  (8,14)
            (10,14)
 * 
 */

public class pairSubArr {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+"  ");
            }
            System.out.println();
        }

    }
    public static void main(String args[]){
        int arr[]={2,6,8,10,14};
        System.out.println(Arrays.toString(arr));
        pairs(arr);
    }
    
}
