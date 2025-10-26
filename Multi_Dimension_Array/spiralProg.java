package Multi_Dimension_Array;
import java.util.*;

public class spiralProg {
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        int a[][]={{1,2,3,4,5},{16,17,18,19,6},{15,24,25,20,7},{14,23,22,21,8},{13,12,11,10,9}};
        // for(int i=0;i<5;i++){
        //     for(int j=0;j<5;j++){
        //         a[i][j]=sc.nextInt();
        //     }
        // }
        int top=0;
        int left=0;
        int bottom=a.length-1;
        int right=a.length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                System.out.print(a[top][i]+" ");

            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }bottom--;
            for(int i=right;i>=top;i--){
                System.out.print(a[i][left]+" ");

            }left++;
        }

    }
    
}
