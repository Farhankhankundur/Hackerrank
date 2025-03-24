import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // Generate and print the series
            int currentTerm = a;
            for (int j = 0; j < n; j++) {
                currentTerm += b * (1 << j); // Using bitwise shift for 2^j
                System.out.print(currentTerm + " ");
            }
            System.out.println(); // Move to the next line for the next query
        }
        in.close();
    }
}
