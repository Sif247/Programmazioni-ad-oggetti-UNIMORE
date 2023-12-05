package dividiArrayConArray;

public class DivideArrays {
    public static double[] divideArrays(double[] v1, double[] v2)
    {
        double[] ris = new double[v1.length];
        for(int i = 0; i < v1.length; i++)
        {
            ris[i] = v1[i] / v2[i];
        }
        return ris;
    }
}
