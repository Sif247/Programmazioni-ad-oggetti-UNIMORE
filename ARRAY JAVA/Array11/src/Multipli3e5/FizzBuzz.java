package Multipli3e5;

public class FizzBuzz {
    public static String[] fizzBuzz(int start, int end)
    {
        String[] dst = new String[end - start];
        int count = 0;
        for(int i = start; i < end; i++)
        {
            String s;
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                s = "FizzBuzz";
            }
            else if (i % 5 == 0)
            {
                s = "Buzz";
            }
            else if(i % 3 == 0)
            {
                s = "Fizz";
            }
            else
            {
                s = Integer.toString(i);
            }

            dst[count] = s;
            count++;
        }
        return dst;
    }
}
