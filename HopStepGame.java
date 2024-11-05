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

    // TODO
    public int minCostTabulation(int squares[])
    {
        return 0;
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