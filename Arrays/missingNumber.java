// package Arrays;
import java.util.*;

public class missingNumber {
    public static void findMissing(int arr[]){
        System.out.println(Arrays.toString(arr));
        int j=1;
        System.out.print("missing number: ");
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=j){
                System.out.print(j+" ");
                i--;
            }  
            j++;      
            }
            
        }
    
    public static void main(String args[]){
        int a[]={1,4,6,9,13};
        findMissing(a);



    }
    
}
