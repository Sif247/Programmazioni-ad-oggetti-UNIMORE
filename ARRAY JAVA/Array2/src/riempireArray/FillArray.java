package riempireArray;

import java.util.Arrays;
import java.util.random.RandomGenerator;


public class FillArray
{
    public static double[] fillArray(int size, double value, boolean addNoise)
    {
        double[] ris = new double[size];
        Arrays.fill(ris,value);
        if(addNoise)
        {
            RandomGenerator num = RandomGenerator.getDefault();
            for(int i = 0; i < size; i++)
            {
                ris[i] = num.nextGaussian();
            }
        }
        return ris;
    }
}
