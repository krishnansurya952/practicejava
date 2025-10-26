import java.util.*;
public class solution169 {
    public static void main(String args[]){


    }
    public static int majorityElement(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[j]=Integer.MAX_VALUE; 
                    count++;
                    
                }
            }
            if()
        }
        return 
    
    }
}
