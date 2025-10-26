import java.io.*;
import java.util.*;

// sample input
// testcase: 2

//           3
//           3 1 0
// output:  -1
//          
//          2
//          0 2
// output:  2


public class makeaarr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i = 0; t_i < T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            int[] A = new int[N];
            for(int i_A = 0; i_A < arr_A.length; i_A++)
            {
            	A[i_A] = Integer.parseInt(arr_A[i_A]);
            }

            int out_ = solve(N, A);
            System.out.println(out_);
            
         }

         wr.close();
         br.close();
    }
static int solve(int N, int[] A){
       // Write your code here
        int sumA = 0;
        int maxA = 0;

        // Calculate the sum of A and the maximum value in A
        for (int i = 0; i < N; i++) {
            sumA += A[i];
            if (A[i] > maxA) {
                maxA = A[i];
            }
        }

        // Check if sumA is divisible by (N - 1)
        if (sumA % (N - 1) != 0) {
            return -1; // Impossible to achieve
        }

        // Calculate the number of operations needed
        int operations = sumA / (N - 1);

        // Check if the maximum value in A is feasible
        if (maxA > operations) {
            return -1; // Impossible to achieve
        }

        return operations; 
}
}