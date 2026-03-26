import java.util.Scanner;

public class Reverse {

    // Prints numbers in reverse order using recursion
    public static void printReverse(int n, Scanner sc) {
        // Base case
        if (n == 0) return;

        int x = sc.nextInt();      // read number
        printReverse(n - 1, sc);   // recursive call
        System.out.print(x + " "); // print after recursion
    }

    /*
    Time Complexity: O(n)
    Explanation: Reads and processes n elements.
    */
}