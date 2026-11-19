class Solution {
    public int lastRemaining(int n) {
        return helper(n, true);
    }

    private int helper(int n, boolean leftToRight) {
        // Base case: only 1 number remains, which is at relative position 1
        if (n == 1) {
            return 1;
        }

        // If moving left-to-right OR total count 'n' is odd,
        // all odd-indexed elements are eliminated, leaving [2, 4, 6, ...].
        // Dividing each remaining element by 2 maps them back to [1, 2, 3, ..., n/2].
        if (leftToRight || n % 2 == 1) {
            return 2 * helper(n / 2, !leftToRight);
        } 
        // If moving right-to-left AND 'n' is even (e.g., [1, 2, 3, 4]),
        // the rightmost (even) elements are removed, leaving [1, 3].
        // Subtracting 1 from the doubled subproblem maps [1, 2] -> [1, 3].
        else {
            return 2 * helper(n / 2, !leftToRight) - 1;
        }
    }
}