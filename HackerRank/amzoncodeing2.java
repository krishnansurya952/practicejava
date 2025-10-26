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
     * Complete the 'findNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY numbers as parameter.
     */

    public static String findNumber(List<Integer> numbers) {
        // Define the number to find
        int numberToFind = 42; // Change this to whatever number you want to search for

        // Check if the number exists in the list
        if (numbers.contains(numberToFind)) {
            return "YES";
        } else {
            return "NO";
        }
    }
}

public class amzoncodeing2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        String result = Result.findNumber(numbers);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
