import java.util.Arrays;

public class solution179 {
    
    public static  String largestNumber(int[] nums) {
        String[] array =  new String[nums.length];
        for(int i=0; i<nums.length; i++){
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array,(a,b)-> (b+a).compareTo(a+b));
        if(array[0].equals("0")){
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(int i=0; i<array.length; i++){
            largest.append(array[i]);
        }
        return largest.toString();
    }
    public static void main(String args[]){
        int arr[]={3,30,34,5,9};
        String a=largestNumber(arr);
        System.out.println(a);

    }
}
    

