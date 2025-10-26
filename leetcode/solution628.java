import java.util.Arrays;

public class solution628 {
    public static int maximumProduct(int []nums){
        int n=nums.length;
        Arrays.sort(nums);
        int m1=nums[n-1]*nums[n-2]*nums[n-3];
        System.out.println("nums[n-1]"+nums[n-1]+"\nnums[n-2]"+nums[n-2]+"\nnums[n-3]"+nums[n-3]);
        System.out.println("m1:"+m1);
        int m2=nums[0]*nums[1]*nums[n-1];
        System.out.println("nums[0]"+nums[0]+"\nnums[1]"+nums[1]+"\nnums[n-1]"+nums[n-1]);
        System.out.println("m2:"+m2);
        if(m1>m2){
            return m1;
        }else{
            return m2;
        }
    }
    public static void main(String args[]){
        int arr[]={-100,-98,-1,2,3,4};
        int fact=1;
        for(int i=0;i<arr.length;i++){
            fact=fact*arr[i];
        }
        System.out.println(fact);
        // int res=maximumProduct(arr);
        // System.out.println(res);
}
}
