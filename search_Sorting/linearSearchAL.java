package search_Sorting;
import java.util.*;


public class linearSearchAL {
    static Scanner sc=new Scanner(System.in);
    public static void linSearch(int arr[]){
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the key: ");
        int key=sc.nextInt();
        String ans="not Present";
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key){
                ans="present";
                // break;
            }

        }
        System.out.println(ans);

    }
    public static void main(String args[]){
        int a[]={11,22,33,44,55,66,77,88};
        linSearch(a);

    }
    
}
