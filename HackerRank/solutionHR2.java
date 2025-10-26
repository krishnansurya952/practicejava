import java.util.Scanner;

public class solutionHR2 {
    public static void main(String[] args) {
        // Create a scanner to read input
        Scanner sc = new Scanner(System.in);
        
        // Read lines of input until we encounter the end of input
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            
            // Break the loop if the line is empty
            if (line.isEmpty()) {
                break;
            }
            
            // Split the input into the language and the number
            String[] parts = line.split(" ");
            String language = parts[0];
            int number = Integer.parseInt(parts[1]);
            
            // Print the language left-justified to 15 characters, and the number with leading zeros
            System.out.printf("%-15s%03d\n", language, number);
        }
        
        // Close the scanner
        sc.close();
    }
}