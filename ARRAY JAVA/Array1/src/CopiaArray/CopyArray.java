package CopiaArray;

public class CopyArray {
    public static double[] copyArray(double[] v)
    {
        double[] ris = new double[v.length];
        System.arraycopy(v,0,ris,0,v.length);

        return ris;
    }
}
