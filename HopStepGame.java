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
        if (len == 1 || len == 2)
            return 0;
        
        else
        {
            return squares[len] + min(minCost(squares, len - 1), minCost(squares, len - 2));
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