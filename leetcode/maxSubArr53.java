public class maxSubArr53 {
    public static int maxSubArray(int[] nums) {
      int max=Integer.MIN_VALUE;
      
      for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            int sum=0;
            for(int k=i;k<=j;k++){
              System.out.print(nums[k]+" ");
              sum+=nums[k];
             
            }
            System.out.print(" : "+sum+" ");
            
        
        // System.out.print();
      
      if(sum>max){
        max=sum;
      }else{
        max=sum;
      }
      System.out.print("\t");
    }
    System.out.println("max sum: "+max);
    System.out.println();
    }
      
      return max;
    }
    public static void main(String args[]){
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int res=maxSubArray(nums);
        System.out.println(res);

    }
    
}
