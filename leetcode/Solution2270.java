public class Solution2270 {
    public static void main(String args[]){
        int a[]={10,4,-8,7};
        int res=waysToSplitArray(a);
        System.out.println(res);
    }
    public static  int waysToSplitArray(int[] num) {
        int n=num.length;
        long left=0,right=0;int c=0;
        long sum=0;
        for(int i:num){
            sum+=i;
        }for(int i=0;i<n-1;i++){
            left+=num[i];
            right=sum-left;
            if(left>=right)
            c++;
        }  
        return c;    
    }
}