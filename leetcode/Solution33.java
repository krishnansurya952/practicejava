public class Solution33 {
    public static void main(String args[]){
        int nums[]={4,5,6,7,0,1,2};
        int res=search(nums,4);
        System.out.println(res);
    }
    public static int search(int[] arr, int target) {
        int n=arr.length;
        int p=peakIndexInMountainArray(arr);
                int l=bs(arr,target,0,p);
                if(l!=-1)
                return l;
                return bs(arr,target,p+1,n-1);
                
            }
            private static int peakIndexInMountainArray(int[] arr) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'peakIndexInMountainArray'");
            }
            static int bs(int []arr,int target, int s,int e){
        while(s<=e){
            int m=s+(e-s)/2;
            if(target>arr[m])s=m+1;
            else if(target<arr[m])e=m-1;
            else return m;
        }
        return -1;
    }
}