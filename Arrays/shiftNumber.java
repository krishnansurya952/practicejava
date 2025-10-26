// package Arrays;
import java.util.*;



public class shiftNumber {
    public static void main(String args[]){
        /*  [0, 1, 1, 0, 0, 0, 1, 0, 1]
            [1, 1, 1, 1, 0, 0, 0, 0, 0] */

        //little bit confustion
        int a[]={0,1,1,0,0,0,1,0,1};
        System.out.println(Arrays.toString(a));
        int left=0;
        int right=a.length-1;
        while(left<=right){
            if(a[left]==0 && a[right]==1){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;

            }
        

        if(a[left]==1)
        left++;
        else if(a[right]==0)
        right--;
        }
        System.out.println(Arrays.toString(a));
    }


























    // public static void main(String args[]){
        /*  [0, 1, 1, 0, 0, 0, 1, 0, 1]
            [0, 0, 0, 0, 0, 1, 1, 1, 1] */

        //little bit confausion
    //     int a[]={0,1,1,0,0,0,1,0,1};
    //     System.out.println(Arrays.toString(a));
    //     int left=0;
    //     int right=a.length-1;
    //     while(left<=right){
    //         if(a[left]==1 && a[right]==0){
    //             int temp=a[left];
    //             a[left]=a[right];
    //             a[right]=temp;
    //             left++;
    //             right--;

    //         }
        

    //     if(a[left]==0)
    //     left++;
    //     else if(a[right]==1)
    //     right--;
    //     }
    //     System.out.println(Arrays.toString(a));
    // }
    


































//     public static void main(String args[]){
//         int a[]={0,1,1,0,0,0,1,0,1};
//         System.out.println(Arrays.toString(a));
//         int arr[]=new int[a.length];
//         int x=0;
//         for(int i=0,y=a.length-1 ;i<a.length; i++){
//             if(a[i]==1){
//                 arr[x++]=a[i];
//             }else{
//                 arr[y--]=a[i];
//             }

//         }
//         System.out.println(Arrays.toString(arr));
//     }
    
}
