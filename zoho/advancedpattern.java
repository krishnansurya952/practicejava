public class advancedpattern{
    // public static void main(String args[]){
    //     int n=4;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         int spaces=2*(n-i);
    //         for(int j=1;j<=spaces;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
            
    //         System.out.println();
    //     }
    //     for(int i=n;i>=0;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         int space=2*(n-i);
    //         for(int j=1;j<=space;j++){
    //             System.out.print("  ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }
    //         *             * 
    //         * *         * *
    //         * * *     * * *
    //         * * * * * * * *
    //         * * * * * * * *
    //         * * *     * * *
    //         * *         * *
    //         *             *



// public static void main(String args[]){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         int space=n-i;
//         for(int j=1;j<=space;j++){
//             System.out.print("  ");
//         }
//         for(int j=1;j<=n;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }
//         * * * * * 
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *


//     public static void main(String args[]){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// 
//     1 
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5



// public static void main(String args[]){
//     int n=5;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }for(int j=i;j>=1;j--){
//             System.out.print(j);
//         }
//         for(int j=2;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }
// }


// //     1
// //    212
// //   32123
// //  4321234
// // 543212345



// public static void main(String args[]){
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("  ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("* ");
//         }
//         for(int j=2;j<=i;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
//     for(int i=n;i>=1;i--){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("  ");
//         }
//         for(int j=1;j<=i;j++){
//             System.out.print("* ");
//         }
//         for(int j=2;j<=i;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
// }

//       * 
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       * 



// public static void main(String args[]){
//     int n=4;
//     for(int i=1;i<=n;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("  ");

//         }
//         for(int j=1;j<=2*i-1;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
//     for(int i=n;i>=1;i-- ){
//         for(int j=1;j<=n-i;j++){
//             System.out.print("  ");
//         }for(int j=1;j<=2*i-1;j++){
//             System.out.print("* ");
//         } 
//         System.out.println();
//     }
// }

//       * 
//     * * *
//   * * * * *
// * * * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *



}