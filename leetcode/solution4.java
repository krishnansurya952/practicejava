import java.util.*;


public class solution4 {
    public static double solve(int arr1[],int arr2[]){
        double temp=0;
        int x=0;

        int arr[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[x++]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr[x++]=arr2[i];
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // int mid=arr.length/2;
        if(arr.length%2==0){//if two element in the middle
            int a=arr[(arr.length/2)-1];
            System.out.println(a);
            int b=arr[(arr.length/2)];
            System.out.println(b);
            temp=(double)(a+b)/2;

        }else{
            int c=arr[arr.length/2];
            System.out.println(c);
            temp=c;
        }



        return temp;
    }
    
        public static double solve1(int[] nums1, int[] nums2) {
            int []merge=new int[nums1.length+nums2.length];
            double temp;
    
    
            int x=0;
            for(int i=0;i<nums1.length;i++){
                merge[x++]=nums1[i];
            }
            for(int i=0;i<nums2.length;i++){
                merge[x++]=nums2[i];
            }
            Arrays.sort(merge);
            System.out.println(Arrays.toString(merge));
            if(merge.length%2==0){
                int a=merge[(merge.length/2)-1];
                int b=merge[(merge.length/2)];
                temp=(double)(a+b)/2;
            }else{
                int c=merge[merge.length/2];
                temp=c;
            }
            return temp;
        }
    




    public static void main(String args[]){
        int arr1[]={1,3};
        int arr2[]={2};
        double res=solve1(arr1,arr2);
        System.out.println(res);


    }
    
}
