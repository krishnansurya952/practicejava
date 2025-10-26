package search_Sorting;
import java.util.*;


public class bubblesort {
    public static void main(String args[]){
        int a[]={5,3,7,8,10,44,1,99,2};

        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){// a.length-1  is not return 
                // error:java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 9
                if(a[j]>a[j+1]){   // a[0]=5 > a[1]=3   true and swap
                    //swap
                    int temp=a[j];//  
                    a[j]=a[j+1];    //a[0]=3
                    a[j+1]=temp;   //a[1]=5
                    // swap again and again
                }

            }
        }
        System.out.println(Arrays.toString(a));

    }
    
}
