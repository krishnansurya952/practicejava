// package Arrays;
import java.util.*;

public class mergeArr {
    public static int[] merge(int a[],int b[]){
        int mer[]=new int[a.length+b.length];
        for(int i=0,x=0,y=0;i<mer.length;i++){
            if(x<a.length)
            mer[i]=a[x++];
            
            else if(y>=0)
            mer[i]=b[y++];
            
        }

        return mer;
    }
    public static void main(String args[]){
        int a[]={10,20,30,40,50};
        int b[]={60,70,80,90,100};
        int res[]=merge(a,b);
        
        System.out.print(Arrays.toString(a)+" + "+Arrays.toString(b));
        System.out.println();
        System.out.println(Arrays.toString(res));

    }























    // public static int[] merge(int arr1[],int arr2[]){
    //     int merges[]=new int[arr1.length+arr2.length];
    //     int x=arr1.length-1;
    //     int y=arr1.length-1;
    //     for(int i=0;i<=merges.length-1;i++){
    //         if(x>=0)
    //         merges[i]=arr2[x--];
    //         else
    //         merges[i]=arr1[y--];
    //     }

    //     return merges;
    // }
    // public static void main(String args[]){
    //     int a[]={10,20,30,40,50};
    //     int b[]={60,70,80,90,100};
    //     int res[]=merge(a,b);
    //     System.out.println(Arrays.toString(res));
    // }
    
}
