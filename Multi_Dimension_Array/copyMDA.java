package Multi_Dimension_Array;
import java.util.*;

public class copyMDA {
    public static int [][] solve(int arr[][]){
        int [][]res=new int[arr.length][];
        for(int i=0;i<arr.length;i++){
            res[i]=new int[arr[i].length];
            for(int j=arr[i].length-1,m=0;j>=0;j--){
                res[i][m++]=arr[i][j];
            }
            
        }
        return res;
        
    }
    public static void main(String args[]){
        int arr[][]={{10,20,30},{40,50},{60,70,80},{10,80,60,40}};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(+arr[i][j]+"  ");
            }
            System.out.println();
        }
        


        int res[][]=solve(arr);
        System.out.println();
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+"  ");

            }
            System.out.println();
        }
    }

    }
    

