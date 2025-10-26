
import java.util.*;
public class solution26 {
    
        public static int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;
    
            int i = 1;
    
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] != nums[i - 1]) {
                    // System.out.println("1."+nums[j]+" "+nums[i - 1]);
                    nums[i] = nums[j];
                    // System.out.println("2."+nums[j]+" "+nums[i - 1]);
                    i++;
                }
            }
    
            return i;        
        }
    
    // public static int removeDuplicates(int[] nums) {
    //     int ans=0;
    //     int arr[]=new int[nums.length];
    //     int x=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]!=nums[j]){
    //                 arr[x++]=nums[j];
    //             }
    //         }
    //     }
    //     System.out.println(Arrays.toString(arr));


    //     return ans;       
        
    // }
    public static void main(String args[]){
        int []a={1,1,2};
        int res= removeDuplicates(a);
        System.out.println("answer: " + res);
    }
    
}
