package MuoviZero;

import java.util.Arrays;

public class MoveZeroEnd {
    public static int[] moveZerosEnd(int[] v)
    {
        int[] ris = new int[v.length];
        int j = 0;
        for(int i = 0; i < v.length; ++i)
        {
            if(v[i] != 0)
            {
                ris[j] = v[i];
                j++;
            }
        }
        return ris;
    }
}
