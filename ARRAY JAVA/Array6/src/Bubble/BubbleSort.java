package Bubble;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSortCopy(int[] v)
    {
        int[] ris = Arrays.copyOf(v, v.length);

        bubbleSort(ris);

        return ris;
    }

    public static void bubbleSort(int[] v)
    {
        boolean fine = true;
        while(fine)
        {
            fine = false;
            for(int i = 0; i < v.length - 1; ++i)
            {
                if(v[i] > v[i + 1])
                {
                    fine = true;
                    int tmp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = tmp;
                }
            }
        }
    }
}
