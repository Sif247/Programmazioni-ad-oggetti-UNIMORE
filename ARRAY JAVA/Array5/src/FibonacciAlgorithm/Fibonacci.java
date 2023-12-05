package FibonacciAlgorithm;

public class Fibonacci {
    public static long[] fibonacci(int n)
    {
        long[] ris;

        if(n == 1 )
        {
            ris = new long[]{0};
        }
        else if (n == 2)
        {
            ris = new long[]{0,1};
        }
        else
        {
            ris = new long[n];
            ris[0] = 0;
            ris[1] = 1;
            {
                for(int i = 2; i < n; i++)
                {
                    ris[i] = ris[i - 1] + ris[i - 2];
                }
            }
        }
        return ris;
    }
}
