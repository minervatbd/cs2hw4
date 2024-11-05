/* Mina Georgoudiou
 * Dr. Andrew Steinberg
 * COP3503 Fall 2024
 * Programming Assignment 4
 */

 public class HopStepGame 
 {
    // no memoization/tabulation
    public int minCost(int squares[], int len)
    {
        return min(minCostR(squares, len), minCostR(squares, len - 1));
    }

    // recursive component
    static int minCostR(int squares[], int len)
    {
        // base case, len 1 or 2
        if (len == 1 || len == 2)
            return 0;
        
        else
        {
            return squares[len] + min(minCostR(squares, len - 1), minCostR(squares, len - 2));
        }
    }

    // TODO
    public int minCostMemoization(int squares[], int len, int memo[])
    {
        return 0;
    }

    // TODO
    public int minCostTabulation(int squares[])
    {
        return 0;
    }

    static int min(int a, int b)
    {
        if (a <= b)
            return a;
        else
            return b;
    }
 }