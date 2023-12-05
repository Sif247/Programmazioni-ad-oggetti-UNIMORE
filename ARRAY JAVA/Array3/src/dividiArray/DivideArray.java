package dividiArray;

public class DivideArray {
    public static double[] divideArray(double[] v, double factor)
    {

        double[] ris = new double[v.length];

        for(int i = 0; i < v.length; i++)
        {
            ris[i] = v[i] / factor;
        }
        return ris;
    }
}
