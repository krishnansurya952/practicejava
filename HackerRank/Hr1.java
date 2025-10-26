import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the array
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        
        // Read the numbers into the list
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        // Call the function to count duplicates
        int result = countDuplicates(numbers);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int countDuplicates(List<Integer> numbers) {
        List<Integer> counted = new ArrayList<>();
        int count = 0;
        
        // Iterate through the list to count duplicates
        for (int number : numbers) {
            if (!counted.contains(number)) {
                int frequency = 0;
                for (int num : numbers) {
                    if (num.equals(number)) {
                        frequency++;
                    }
                }
                if (frequency > 1) {
                    count++;
                }
                counted.add(number); // Mark this number as counted
            }
        }
        
        return count;
    }
}

// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



// class Result {

//     /*
//      * Complete the 'countDuplicate' function below.
//      *
//      * The function is expected to return an INTEGER.
//      * The function accepts INTEGER_ARRAY numbers as parameter.
//      */

//     public static int countDuplicate(List<Integer> numbers) {
//     // Write your code here
//     List<Integer> counted = new ArrayList<>();
//         int count = 0;
        
//         // Iterate through the list to count duplicates
//         for (int number : numbers) {
//             if (!counted.contains(number)) {
//                 int frequency = 0;
//                 for (int num : numbers) {
//                     if (num==(number)) {
//                         frequency++;
//                     }
//                 }
//                 if (frequency > 1) {
//                     count++;
//                 }
//                 counted.add(number); // Mark this number as counted
//             }
//         }
        
//         return count;


//     }

// }

// // public class Solution {
// //     public static void main(String[] args) throws IOException {
// //         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
// //         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

// //         int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

// //         List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
// //             try {
// //                 return bufferedReader.readLine().replaceAll("\\s+$", "");
// //             } catch (IOException ex) {
// //                 throw new RuntimeException(ex);
// //             }
//         })
//             .map(String::trim)
//             .map(Integer::parseInt)
//             .collect(toList());

//         int result = Result.countDuplicate(numbers);

//         bufferedWriter.write(String.valueOf(result));
//         bufferedWriter.newLine();

//         bufferedReader.close();
//         bufferedWriter.close();
//     }
// }
