package search_Sorting;
import java.util.*;

/*
 * Binary Search 
 * array shouldbe sorted in ascending order or descending order
 * 
 */

public class binarySearchAL {
    static Scanner sc=new Scanner(System.in);

    public static void binarySearch(int arr[]){
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the Key: ");
        int key=sc.nextInt();
        String ans="not Present";
        int start=0,length=arr.length-1;
        while(start<=length){
            int middle=(start+length)/2;
            if(key==arr[middle]){
                ans="present";
                break;
            }//left
            else if(key<=arr[middle]){
                length=middle-1;
            }//right
            else if(key>=arr[middle]){
                start=middle+1;
            }
            
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        int a[]={10,20,30,40,50,60,70,80};
        binarySearch(a);


    }
    
}
