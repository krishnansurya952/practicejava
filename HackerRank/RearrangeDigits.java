// // // // import java.io.BufferedReader;
// // // // import java.io.BufferedWriter;
// // // // import java.io.FileWriter;
// // // // import java.io.IOException;
// // // // import java.io.InputStreamReader;
// // // // import java.io.OutputStreamWriter;
// // // // import java.util.*;

// // // // // public class solutiohr2 {
// // // // //     public static String getLargestNumber(String input) {
// // // // //         int largest = Integer.MIN_VALUE; // Initialize largest to the smallest integer
// // // // //         StringBuilder currentNumber = new StringBuilder(); // To build the current number

// // // // //         for (char c : input.toCharArray()) {
// // // // //             if (Character.isDigit(c)) {
// // // // //                 currentNumber.append(c); // Append digit to current number
// // // // //             } else {
// // // // //                 if (currentNumber.length() > 0) {
// // // // //                     // Convert current number to integer and compare
// // // // //                     largest = Math.max(largest, Integer.parseInt(currentNumber.toString()));
// // // // //                     currentNumber.setLength(0); // Reset current number
// // // // //                 }
// // // // //             }
// // // // //         }

// // // // //         // Check for the last number in case the string ends with a digit
// // // // //         if (currentNumber.length() > 0) {
// // // // //             largest = Math.max(largest, Integer.parseInt(currentNumber.toString()));
// // // // //         }

// // // // //         return largest == Integer.MIN_VALUE ? "No numbers found" : String.valueOf(largest);
// // // // //     }

// // // // //     public static void main(String[] args) throws IOException {
// // // // //         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
// // // // //         BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

// // // // //         System.out.println("Enter a string:");
// // // // //         String input = reader.readLine();
// // // // //         String result = getLargestNumber(input);
// // // // //         writer.write("The largest number is: " + result);
// // // // //         writer.flush();
// // // // //     }
// // // // // }import java.io.*;
// // // // // import java.util.*;

// // // // class Result {

// // // //     /*
// // // //      * Complete the 'getLargestNumber' function below.
// // // //      *
// // // //      * The function is expected to return a STRING.
// // // //      * The function accepts STRING num as parameter.
// // // //      */

// // // //     public static String getLargestNumber(String num) {
// // // //         // Write your code here
// // // //         char[] arr = num.toCharArray();
// // // //         Arrays.sort(arr);
// // // //         return new StringBuilder(new String(arr)).reverse().toString();
// // // //     }

// // // // }

// // // // public class solutiohr2 {
// // // //     public static void main(String[] args) throws IOException {
// // // //         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
// // // //         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

// // // //         String num = bufferedReader.readLine();

// // // //         String result = Result.getLargestNumber(num);

// // // //         bufferedWriter.write(result);
// // // //         bufferedWriter.newLine();

// // // //         bufferedReader.close();
// // // //         bufferedWriter.close();
// // // //     }
// // // // }
// // // import java.util.*;

// // // public class RearrangeNumber {
    
// // //     public static String rearrangeNumber(String num) {
// // //         // Convert the string to a list of characters
// // //         char[] digits = num.toCharArray();
        
// // //         // Separate even and odd parity digits
// // //         List<Character> evenDigits = new ArrayList<>();
// // //         List<Character> oddDigits = new ArrayList<>();
        
// // //         for (char digit : digits) {
// // //             if ((digit - '0') % 2 == 0) {
// // //                 evenDigits.add(digit);
// // //             } else {
// // //                 oddDigits.add(digit);
// // //             }
// // //         }
        
// // //         // Sort even digits in descending order
// // //         Collections.sort(evenDigits, Collections.reverseOrder());
        
// // //         // Rebuild the number with sorted even digits and unchanged odd digits
// // //         StringBuilder result = new StringBuilder();
// // //         int evenIndex = 0;
        
// // //         for (char digit : digits) {
// // //             if ((digit - '0') % 2 == 0) {
// // //                 result.append(evenDigits.get(evenIndex));
// // //                 evenIndex++;
// // //             } else {
// // //                 result.append(digit);
// // //             }
// // //         }
        
// // //         return result.toString();
// // //     }

// // //     public static void main(String[] args) {
// // //         // Sample test cases
// // //         System.out.println(rearrangeNumber("0082663"));  // Expected Output: "8662003"
// // //         System.out.println(rearrangeNumber("5528200"));  // Expected Output: "5562280"
// // //     }
// // // }
// // import java.util.*;

// // public class LargestNumber {
    
// //     public static String getLargestNumber(String num) {
// //         // Convert the string to a list of characters
// //         char[] digits = num.toCharArray();
        
// //         // Separate even and odd digits
// //         List<Character> evenDigits = new ArrayList<>();
        
// //         for (char digit : digits) {
// //             if ((digit - '0') % 2 == 0) {  // Even digits
// //                 evenDigits.add(digit);
// //             }
// //         }
        
// //         // Sort even digits in descending order
// //         Collections.sort(evenDigits, Collections.reverseOrder());
        
// //         // Rebuild the number with sorted even digits and unchanged odd digits
// //         StringBuilder result = new StringBuilder();
// //         int evenIndex = 0;
        
// //         for (char digit : digits) {
// //             if ((digit - '0') % 2 == 0) {  // If the current digit is even
// //                 result.append(evenDigits.get(evenIndex));  // Place the next largest even digit
// //                 evenIndex++;
// //             } else {
// //                 result.append(digit);  // Odd digits stay in the same position
// //             }
// //         }
        
// //         return result.toString();
// //     }

// //     public static void main(String[] args) {
// //         // Sample test cases
// //         System.out.println(getLargestNumber("0082663"));  // Expected Output: "8662003"
// //         System.out.println(getLargestNumber("5528200"));  // Expected Output: "5562280"
// //         System.out.println(getLargestNumber("1806579"));  // Expected Output: "1860975"
// //     }
// // }
// import java.util.*;

// public class LargestNumber {
    
//     public static String getLargestNumber(String num) {
//         // Convert the string to a list of characters
//         char[] digits = num.toCharArray();
        
//         // Separate even and odd digits
//         List<Character> evenDigits = new ArrayList<>();
        
//         for (char digit : digits) {
//             if ((digit - '0') % 2 == 0) {  // Even digits
//                 evenDigits.add(digit);
//             }
//         }
        
//         // Sort even digits in descending order
//         Collections.sort(evenDigits, Collections.reverseOrder());
        
//         // Rebuild the number with sorted even digits and unchanged odd digits
//         StringBuilder result = new StringBuilder();
//         int evenIndex = 0;
        
//         for (char digit : digits) {
//             if ((digit - '0') % 2 == 0) {  // If the current digit is even
//                 result.append(evenDigits.get(evenIndex));  // Place the next largest even digit
//                 evenIndex++;
//             } else {
//                 result.append(digit);  // Odd digits stay in the same position
//             }
//         }
        
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         // Sample test cases
//         System.out.println(getLargestNumber("0082663"));  // Expected Output: "8662003"
//         System.out.println(getLargestNumber("5528200"));  // Expected Output: "5562280"
//         System.out.println(getLargestNumber("1806579"));  // Expected Output: "1860975"
//     }
// }
import java.util.*;

public class RearrangeDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        String rearrangedNumber = rearrangeDigits(input);
        System.out.println("Rearranged Number: " + rearrangedNumber);
    }

    public static String rearrangeDigits(String number) {
        List<Character> evenDigits = new ArrayList<>();
        List<Character> oddDigits = new ArrayList<>();

        // Separate even and odd digits
        for (char digit : number.toCharArray()) {
            if (Character.getNumericValue(digit) % 2 == 0) {
                evenDigits.add(digit);
            } else {
                oddDigits.add(digit);
            }
        }

        // Sort even digits in descending order
        Collections.sort(evenDigits, Collections.reverseOrder());

        // Sort odd digits in ascending order
        Collections.sort(oddDigits);

        // Combine even and odd digits
        StringBuilder sb = new StringBuilder();
        for (char digit : evenDigits) {
            sb.append(digit);
        }
        for (char digit : oddDigits) {
            sb.append(digit);
        }

        return sb.toString();
    }
}