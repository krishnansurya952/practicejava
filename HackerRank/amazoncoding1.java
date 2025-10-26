import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'findScore' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING userID1
     *  2. STRING userID2
     *  3. INTEGER p
     */

    public static int findScore(String userID1, String userID2, int p) {
    int n = userID1.length();
    int m = userID2.length();
    
    // Frequency array for userID2
    int[] userID2Freq = new int[26];
    for (char c : userID2.toCharArray()) {
        userID2Freq[c - 'a']++;
    }
    
    int validCount = 0;
    
    // Loop through userID1 with valid starting points
    for (int i = 0; i <= n - m * p; i++) { // Adjusted condition
        int[] userID1Freq = new int[26];
        boolean valid = true; // Flag to check if we can fill the frequency array
        
        for (int j = 0; j < m; j++) {
            int index = i + j * p;
            if (index >= n) { // Check if index is out of bounds
                valid = false;
                break;
            }
            userID1Freq[userID1.charAt(index) - 'a']++;
        }
        
        if (valid && Arrays.equals(userID1Freq, userID2Freq)) {
            validCount++;
        }
    }
    
    return validCount;
}
}

public class amazoncoding1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String userID1 = bufferedReader.readLine();

        String userID2 = bufferedReader.readLine();

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.findScore(userID1, userID2, p);
        // System.out.println(result);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
