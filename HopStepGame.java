/* Mina Georgoudiou
 * Dr. Andrew Steinberg
 * COP3503 Fall 2024
 * Programming Assignment 4
 */

 public class HopStepGame 
 {
    // recursive solution
    public int minCost(int squares[], int len)
    {
        // base case, len 1 or 2
        if (len == 0 || len == 1)
            return squares[len];
        
        // recur and pick min path
        return squares[len] + min(minCost(squares, len - 1), minCost(squares, len - 2));

    }

    // memoized
    public int minCostMemoization(int squares[], int len, int memo[])
    {
        // base case
        if (len == 0 || len == 1)
            return squares[len];
        
        // check for a memo
        if (memo[len] != 0)
            return memo[len];
        
        // add a memo and recur
        return memo[len] = squares[len] + min(minCostMemoization(squares, len - 1, memo), minCostMemoization(squares, len - 2, memo));
    }

    // tabulated approach
    public int minCostTabulation(int squares[])
    {
        int n = squares.length;

        // table
        int[] tab = new int[n];

        // base cases
        tab[0] = squares[0];
        tab[1] = squares[1];

        int c;

        // bottom up approach
        for (c = 2; c < n - 1; c++)
        {
            tab[c] = squares[c] + min(tab[c - 1], tab[c - 2]);
        }

        return tab[c - 1];
    }

    // helper function, returns smaller of two ints
    static int min(int a, int b)
    {
        if (a <= b)
            return a;
        else
            return b;
    }
 }