import java.util.*;

public class solution283 {
    public static void main(String args[]){
        int arr[]={0,1,0,3,12};
        System.out.println(Arrays.toString(arr));
        solve(arr);
        
    }
    public static void solve(int arr[]){
        //2nd way
        int left=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left++]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));





        // System.out.println(Arrays.toString(arr));
        // int res[]=new int[arr.length];
        // int k=arr.length-1;
        // int n=0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==0){
        //         res[k--]=arr[i];
                
        //     }else if(arr[i]!=0){
        //         res[n++]=arr[i];
        //     }
            
        // }
        // System.out.println(Arrays.toString(res));
    }
    
}
