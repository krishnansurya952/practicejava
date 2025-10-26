// // import java.util.*;
// // import java.lang.*;
// // class Solution {
// //     public static void main(String[] args) {
// //         Scanner in = new Scanner(System.in);
// //         int num = in.nextInt();
// //         System.out.println(arrangeDigits(num));
// //     }
// //     public static int arrangeDigits(int num) {
// //         // Convert the integer to a string
// //         String numStr = String.valueOf(num);
// //         // Create a list to store the digits
// //         List<Integer> digits = new ArrayList<>();
// //         // Iterate over the digits and add them to the list
// //         for (char c : numStr.toCharArray()) {
// //             digits.add(Character.getNumericValue(c));
// //         }
// //         // Sort the digits in descending order
// //         Collections.sort(digits, Collections.reverseOrder());
// //         // Create a new string to store the arranged digits
// //         StringBuilder sb = new StringBuilder();
// //         // Iterate over the digits and add them to the string
// //         for (int digit : digits) {
// //             sb.append(digit);
// //         }
// //         // Convert the string to an integer and return it
// //         return Integer.parseInt(sb.toString());
// //     }
// // }

// // class Solution {
// //     /**
// //      * Given a number num as a string, you can swap two adjacent digits if both
// //      * digits have the same parity, i.e., both digits are odd or both are even.
// //      * You can perform this swap operation as many times as needed.
// //      * Your task is to find the largest possible number that can be created by
// //      * applying the swap operation.
// //      *
// //      * @param num a string of digits
// //      * @return the largest number that can be created
// //      *
// //      * Example:
// //      * ----------
// //      * Input: num = "7596801"
// //      * Output: "9758601"
// //      *
// //      * Constraints:
// //      * ----------
// //      * 1 <= length of num <= 10^5
// //      * num consists of digits 0-9 only.
// //      *
// //      */
// //     public String getLargestNumber(String num) {
// //         char[] chars = num.toCharArray();
// //         for (int i = 0; i < chars.length - 1; i++) {
// //             for (int j = i + 1; j < chars.length; j++) {
// //                 if ((chars[i] % 2 == chars[j] % 2) && chars[i] < chars[j]) {
// //                     char temp = chars[i];
// //                     chars[i] = chars[j];
// //                     chars[j] = temp;
// //                 }
// //             }
// //         }
// //         return new String(chars);
// //     }
// // }

// class Solution {
//     /**
//      * Given a number num as a string, you can swap two adjacent digits
//      * if both digits have the same parity, i.e., both digits are odd or both
//      * are even. You can perform this swap operation as many times as
//      * needed.
//      * Your task is to find the largest possible number that can be created
//      * by applying the swap operation.
//      *
//      * Example
//      * Let num = "7596801".
//      * Swap 5 and 9 -> "7956801"
//      * Swap 7 and 9 -> "9756801"
//      * Swap 6 and 8 -> "9758601"
//      * The largest value possible is "9758601".
//      *
//      * @param num a string of digits
//      * @return the largest number that can be created
//      */
//     public String getLargestNumber(String num) {
//         char[] chars = num.toCharArray();
//         for (int i = 0; i < chars.length - 1; i++) {
//             for (int j = i + 1; j < chars.length; j++) {
//                 if (isSwappable(chars[i], chars[j])) {
//                     swap(chars, i, j);
//                 }
//             }
//         }
//         return new String(chars);
//     }

//     private boolean isSwappable(char a, char b) {
//         return (a % 2 == 0 && b % 2 == 0) || (a % 2 == 1 && b % 2 == 1);
//     }

//     private void swap(char[] chars, int i, int j) {
//         char temp = chars[i];
//         chars[i] = chars[j];
//         chars[j] = temp;
//     }
// }

class Solution {
    /**
     * Given a number num as a string, you can swap two adjacent digits
     * if both digits have the same parity, i.e., both digits are odd or both
     * are even. You can perform this swap operation as many times as
     * needed.
     * Your task is to find the largest possible number that can be created
     * by applying the swap operation.
     *
     * Example
     * Let num = "7596801".
     * Swap 5 and 9 -> "7956801"
     * Swap 7 and 9 -> "9756801"
     * Swap 6 and 8 -> "9758601"
     * The largest value possible is "9758601".
     *
     * @param num a string of digits
     * @return the largest number that can be created
     *
     * Constraints
     * 1 ≤ length of num ≤ 10^5
     * num consists of digits 0-9 only.
     */
    public String getLargestNumber(String num) {
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if ((chars[i] % 2 == chars[j] % 2) && chars[i] < chars[j]) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
            }
        }
        return new String(chars);
    }
}