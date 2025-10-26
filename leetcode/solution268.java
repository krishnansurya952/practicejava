import java.util.*;


public class solution268 {
    public static int missingNumber(int [] nums){

        int res=nums.length;
        for(int i=0;i<nums.length;i++){
            res+=i-nums[i];
        }


        return res;
        // int n=nums.length;
        // int k=0;
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=i){
        //         k=i;

        //     }
        // }


        // return k;


    }
    public static void main(String args[]){

        int arr[]={3,0,1
        };
        int res=missingNumber(arr);
        System.out.println(res);

    }
    
}
