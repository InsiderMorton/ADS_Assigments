public class SumSquares {

    // Calculates 1^2 + 2^2 + ... + n^2 using recursion
    public static int calculate(int n) {
        // Base case
        if (n == 1) return 1;

        // Recursive case
        return calculate(n - 1) + n * n;
    }

    /*
    Time Complexity: O(n)
    Explanation: The function calls itself n times,
    decreasing n by 1 each time.
    */
}
