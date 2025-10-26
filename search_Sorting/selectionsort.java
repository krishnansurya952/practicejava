package search_Sorting;
import java.util.*;

public class selectionsort {
    public static void main(String args[]){
        int a[]={2,25,1,3,6};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[smallest]){
                    smallest=j;
                }
            }
                int temp=a[smallest];
                a[smallest]=a[i];
                a[i]=temp;
            }
            System.out.println(Arrays.toString(a));
        
        
    }
    
}
