package hash;
import java.util.HashMap;



public class hashingQuestin1{
    public static void majorityElement(int nums[]){
        
        HashMap <Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        System.out.println(map);
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
        System.out.println(map);



    }

    public static void main(String args[]){
        int nums[]={1,3,2,5,1,3,1,5,1};
        int nums1[]={1,2};
        majorityElement(nums);





    }
}