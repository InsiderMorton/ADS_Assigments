public class SumArray {

    // Calculates sum of array elements using recursion
    public static int calculate(int[] arr, int n) {
        // Base case
        if (n == 0) return 0;

        // Recursive case
        return arr[n - 1] + calculate(arr, n - 1);
    }

    /*
    Time Complexity: O(n)
    Explanation: Each element is processed once.
    */
}