import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        // Input Data
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of test cases
        long A,B;

        List<Long> results = new ArrayList<>();

        for (int i=0; i<T; i++) {
            A = sc.nextLong();
            B = sc.nextLong();
            // Storing Results
            results.add(squareIntegers(A,B));
        }

        // Printing Results
        for (Long r : results) {
            System.out.println(r);
        }
    }

    // Calculating amount of square integers
    private static Long squareIntegers(long a, long b) {

        a = (long)Math.ceil(Math.sqrt(a));
        b = (long)Math.floor(Math.sqrt(b));

        return new Long((b-a)+1);
    }
}

