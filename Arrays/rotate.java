// package Arrays;
import java.util.*;

public class rotate {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        // int a[]={10,20,30,40,50,60,70};
        int a[]={1,2};
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the number of times to rotate: ");
        int r=1;
        if(r%2==0 || r==1){
            for(int i=0;i<r;i++){
            int zeroIndex=a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=zeroIndex;
        }
        System.out.println(Arrays.toString(a));

        }else{
            for(int i=0;i<=r;i++){
            int zeroIndex=a[0];
            for(int j=0;j<a.length-1;j++){
                a[j]=a[j+1];
            }
            a[a.length-1]=zeroIndex;
        }
        System.out.println(Arrays.toString(a));

        }
        
    }




























    // public static void toRotate(int arr[]){
    //     System.out.println(Arrays.toString(arr));
    //     System.out.print("Enter the no of times to rotate: ");
    //     int n=sc.nextInt();
    //     for(int i=0;i<n;i++){
    //         int first=arr[0];
    //         for(int j=0;j<arr.length-1;j++){
    //             arr[j]=arr[j+1];
    //         }
    //         arr[arr.length-1]=first;
    //     }
    //     System.out.println(Arrays.toString(arr));

    // }
    // public static void main(String args[]){
    //     int a[]={10,20,30,40,50};
    //     toRotate(a);
        
    // }
    
}
