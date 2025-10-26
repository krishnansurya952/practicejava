import java.util.*;

public class solution48{
    public static int[][] rotate(int[][] matrix){
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
                System.out.print(j+","+i+":"+temp+" ");
                
            }
        }
        for(int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
        return matrix;
    }
    public static void reverse(int arr[]){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String args[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(Arrays.toString(arr[2]));
        int res[][]=rotate(arr);
        // for(int i=0;i<arr[i].length;i++){
        //         // System.out.println("\t\t"+Arrays.toString(res[i]));
        //     }



    }
}