// package Arrays;

public class subArrMaxSum {
    public static void solve(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print(" : "+sum+" ");
                if(sum<0){
                    sum=0;

                }else if(sum>max){
                    max=sum;
                }
                    
                    
                
                System.out.print("\t");
            }
            System.out.print("Max sum is: "+max);
            System.out.println();
        }
    }
    public static void Min(int arr[]){
        //not change any code 
        // just replace max=min
        int max=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.print(" : "+sum+" ");
                if(sum<0){
                    sum=0;

                }else if(sum>max){
                    max=sum;
                }
                    
                    
                
                System.out.print("\t");
            }
            System.out.print("Min sum is: "+max);
            System.out.println();
        }
    }
    public static void main(String args[]){
        int a[]={-2,1,-3,4,-1,2,1,-5,4};
        solve(a);
        // Min(a);//not working correctly
    }
    
}
