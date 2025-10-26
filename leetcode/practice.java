
public class practice{
    
}





















// public class practice{
//     public static void main(String args[]){
//         int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
//         int currentsum=0;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             currentsum=currentsum+arr[i];
//         if(currentsum<0){
//             currentsum=0;
//         }
//         if(currentsum>max){
//             max=currentsum;
//             }
//         }
//         System.out.println(max);

        
//     }
// }












// public class practice{
//     public static int maxSubArray(int[] nums) {
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             for(int j=i;j<nums.length;j++){
//                 int sum=0;
//                 for(int k=i;k<=j;k++){
//                     // System.out.print(nums[k]+" ");
//                     sum+=nums[k];
//                 }
//                 // System.out.print(" : "+sum+" \t");
//                 if(sum<0){
//                     sum=0;
//                 }if(sum>max){
//                     max=sum;
//                 }
                

//             }
//             System.out.println("");
//         }



//         return max;
//     }
//     public static void main(String args[]){

//         int a[]= {-2,1,-3,4,-1,2,1,-5,4};
//         int res=maxSubArray(a);
//         System.out.println(res);

//     }
// }