import java.util.*;
public class demo {
    public static void solve(int arr[][]){
        int res[][]=new int[arr.length][];
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int a[][]={{10,20,30},{40,50},{60,70,80},{10,80,50,60}};
        for( int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        solve(a);
        


    }
    
}
