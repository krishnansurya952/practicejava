package search_Sorting;
import java.util.*;

public class mergeSort {
    public static void add(int arr[],int start,int middle,int end){
        int merge[]=new int[end-start+1];
        int left=start;
        int right=middle+1;
        int x=0;
        while(left<=middle && right<=end){
            if(arr[left]<=arr[right]){
                merge[x++]=arr[left++];
            }else{
                merge[x++]=arr[right++];
            }
        }while(left<=middle){
            merge[x++]=arr[left++];
        }while(right<=end){
            merge[x++]=arr[right++];
        }
        for(int i=0,j=start;i<merge.length;i++,j++){
                arr[j]=merge[i];
        }

    } 
    public static void div(int arr[],int start,int end){
        if(start>=end){
            return;

        }
        int middle=start+(end-start)/2;
        div(arr,start,middle);
        div(arr,middle+1,end);
        add(arr,start,middle,end);
    }
    public static void main(String args[]){
        int arr[]={87,1,6,7,2,4,90,-65,42};
        System.out.println(Arrays.toString(arr));
        div(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
























    // public static void mergeSor(int arr[],int start,int middle,int end){
    //     int merged[]=new int[end-start+1];
    //     int idx1=start;
    //     int idx2=middle+1;
    //     int x=0;
    //     while(idx1<=middle && idx2<=end){
    //         if(arr[idx1]<=arr[idx2]){
    //             merged[x++]=arr[idx1++];
    //             // idx1++;
    //             // x++;
    //         }else {
    //             merged[x++]=arr[idx2++];
    //             // idx2++;
    //             // x++;
    //         }
    //     }
    //         while(idx1<=middle){
    //             merged[x++]=arr[idx1++];
    
    //         }while(idx2<=end){
    //             merged[x++]=arr[idx2++];
                
    //         }
        
    //     for(int i=0,j=start;i<merged.length;i++,j++){
    //         arr[j]=merged[i];
    //     }
    // }
    // public static void divide(int arr[], int start,int end){
    //     if(start>=end){
    //         return ;
    //     }
    //     int middle=(start+(end-start)/2);
    //     divide(arr,start,middle);
    //     divide(arr,middle+1,end);
    //     mergeSor(arr, start, middle, end );
    // }
    // public static void main(String args[]){
    //     int arr[]={3,9,4,1,6,7,2,8};
    //     System.out.println(Arrays.toString(arr));
    //     divide(arr,0,arr.length-1);
    //     System.out.println(Arrays.toString(arr));

    // }
    
}
