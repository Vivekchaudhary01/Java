// WAJP to print nth term of Fibonacci series by memoization technique.
// Memoization is an optimization technique used to speed up recursive algorithms by storing the results of expensive function calls and reusing them when the same inputs occur again.
// It is particularly useful in problems with overlapping subproblems, such as the Fibonacci sequence.
// In this example, we will compute the nth term of the Fibonacci series using memoization.


public class FibonacciMemoization {
    public static void main(String[] args) {
        int n = 10; // Change this value to compute a different term
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1; // Initialize memoization array with -1
        }
        System.out.println("Fibonacci term at position " + n + " is: " + fibonacci(n, memo));
    }
    public static int fibonacci(int n, int[] memo) {
        if (n <= 1) {
            return n; // Base case: F(0) = 0, F(1) = 1
        }
        if (memo[n] != -1) {
            return memo[n]; // Return already computed value
        }
        // Compute and store the value in the memoization array
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }
}
