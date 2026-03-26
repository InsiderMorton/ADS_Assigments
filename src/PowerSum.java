public class PowerSum {

    // Calculates b^0 + b^1 + ... + b^n using recursion
    public static int calculate(int b, int n) {
        // Base case
        if (n == 0) return 1;

        // Recursive case
        return calculate(b, n - 1) + (int)Math.pow(b, n);
    }

    /*
    Time Complexity: O(n)
    Explanation: The function is called n times.
    */
}