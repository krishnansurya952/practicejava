import java.util.HashMap;
import java.util.Map;

public class p1 {
    public static void main(String args[]){
        int nums[]={3,1,4,1,5};
         Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        System.out.println(map);
    }
    
}
