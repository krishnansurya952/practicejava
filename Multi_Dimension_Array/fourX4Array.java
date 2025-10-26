package Multi_Dimension_Array;
import java.util.*;


public class fourX4Array {
    static Scanner sc=new Scanner(System.in);
    public static void toptoBottomLefttoRight(int arr[][]){
        System.out.println("\t\t\tTop to Bottom and Left to Right");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\t\t\t********************************");
    }

    public static void toptoBottomRighttoLeft(int arr[][]){
        System.out.println("\t\t\tTop to Bottom and Right to Left");
        for(int i=0;i<arr.length;i++){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\t\t\t********************************");
    }
    public static void bottomtoToplefttoRight(int arr[][]){
        System.out.println("\t\t\t Bottom to Top and Left to right");
        for(int i=arr.length-1;i>=0;i--){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\t\t\t********************************");
    }
    public static void bottomtoTopRighttoLeft(int arr[][]){
        System.out.println("\t\t\t Bottom to Top and right to right");
        for(int i=arr.length-1;i>=0;i--){
            for(int j=arr[i].length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\t\t\t********************************");
    }

    public static void insertElement(int arr[][]){
        System.out.println("\t\tInserting Array Element ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("arr["+i+"]["+j+"]: " );
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int [][]a=new int[4][4];
        insertElement(a);
        toptoBottomLefttoRight(a);
        toptoBottomRighttoLeft(a);
        bottomtoToplefttoRight(a);
        bottomtoTopRighttoLeft(a);

        
        
        

    }
    
}
