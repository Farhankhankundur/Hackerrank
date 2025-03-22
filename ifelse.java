import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int N = scanner.nextInt();

        // to Check the conditions
        if (N % 2 == 1) {
            // N is odd
            System.out.println("Weird");
        } else {
            // N is even
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }

        
    }
}
