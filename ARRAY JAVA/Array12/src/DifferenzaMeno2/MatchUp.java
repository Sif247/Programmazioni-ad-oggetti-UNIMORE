package DifferenzaMeno2;

public class MatchUp {
    public static int matchUp(int[] v1, int[] v2)
    {
        int diff;
        int somma = 0;
        for(int i = 0; i < v1.length; i++)
        {
            if(v1[i] >= v2[i])
            {
                diff = v1[i] - v2[i];
                if(diff != 0 && diff <= 2)
                {
                    somma++;
                }
            }
            else if(v2[i] > v1[i])
            {
                diff = v2[i] - v1[i];
                if(diff != 0 && diff <= 2)
                {
                    somma++;
                }
            }
        }
        return somma;
    }
}
