package zoho;
import java.util.*;

public class star {
    static Scanner sc=new Scanner(System.in);

    // public static void main(String args[]){
    //     int n=6;
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<i;j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    //  /*         
    //             * 
    //             * *
    //             * * *
    //             * * * *
    //             * * * * *
    //  */



    // public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the input n: ");
    //     int n=sc.nextInt();
    //     for(int i=n;i>=0;i--){
    //         for(int j=i;j>0;j--){
    //         System.out.print("*"+ " ");
    //         }
    //         System.out.println();
    //     }
    //     /*
    //      * Enter the input n: 5
    //             * * * * * 
    //             * * * *
    //             * * *
    //             * *
    //             *
    //      */
        
        
    // }





    // public static void main(String args[]){
    //     int n=5;
    //     for(int i=0;i<n;i++){
    //         // System.out.print(" ");
    //         for(int j=i;j<=n;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=0;j<=i;j++){
    //             System.out.print("*"+" ");
    //         }
    //         System.out.println();
            
    //     }
    // }
    /*

                        *
                       **
                      ***
                     ****
                    *****
     */











    // public static void main(String args[]){
    //     int n = 6; // Number of rows
    //     int num = 1; // Starting number

    //     for (int i = 1; i <= n; i++) {
    //         // Print leading spaces for alignment
    //         for (int j = 1; j < i; j++) {
    //             // System.out.print("   "); // Adjust space for better alignment
    //         }

    //         // Print numbers in the current row
    //         for (int j = 0; j < i; j++) {
    //             System.out.print(num + " ");
    //             num++;
    //         }

    //         // Move to the next line after each row
    //         System.out.println();
    //     }
    // }


    //! APNA COLLEGE

    // public static void main(String args[]){
    //     int n=5;
    //     int m=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=m;j++){
    //             if(i==1||j==1||i==n||j==m)
    //             System.out.print("* ");
    //             else{
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();
    //     }

    // }
    // /*
     
    // * * * * * 
    // *       *
    // *       *
    // * * * * *

    //  */

    // public static void main(String args[]){
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // /*
      
    // * 
    // * *
    // * * *
    // * * * *

    //  */


    // public static void main(String args[]){
    //     int n=4;
    //     for(int i=n;i>0;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // /*
     
    // * * * * 
    // * * *
    // * *
    // *

    //  */

    // public static void main(String args[]){
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //         }
    //         System.out.println();
    //     }
        
    // }

    // /*
     
    //        *
    //       **
    //      ***
    //     ****

    //  */

    // public static void main(String args[]){
    //     int n=5;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // 1 
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5   
    
    // public static void main(String args[]){
    //     int n=5;
    //     for(int i=n;i>0;i--){
    //         for(int j=1;j<=i;j++ ){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // /*

    // 1 2 3 4 5 
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1

    //  */

        // public static void main(String args[]){
        //         int n=5;
        //         for(int i=1;i<=n;i++){
        //             for(int j=1;j<=n-i+1;j++ ){
        //                 System.out.print(j+" ");
        //             }
        //             System.out.println();
        //         }
        //     }

        //     1 2 3 4 5 
        //     1 2 3 4
        //     1 2 3
        //     1 2
        //     1


        // public static void main(String args[]){
        //     int n=5;
        //     int t=1;
        //     for(int i=1;i<=n;i++){
        //         for(int j=1;j<=i;j++){
        //             System.out.print(t+++" ");
        //         }
        //         System.out.println();
        //     }
        // }

        // /*
        
        // 1 
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        //  */


        public static void main(String args[]){
            int n=5;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print("1"+" ");
                    }else{
                        System.out.print("0"+" ");
                    }

                }
                System.out.println();
            }
        }





    
}
