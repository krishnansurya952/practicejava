

package hash;
import java.util.*;

public class hashingQuestion2 {
    public static void solve(int arr[],int arr2[]){
        HashSet <Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);

        }
        System.out.println(set);
        System.out.println(set.size());

    }
    public static void main(String args[]){
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        solve(arr1,arr2);
    }
    
}
