package OvunqueCoppia;

public class IsEverywhere {
    public static boolean isEverywhere(int[] v, int value)
    {
        for(int i = 0; i < v.length; i++)
        {
            if(v[i] == value)
            {
                if((i + 2) >= v.length)
                {
                    break;
                }
                else if(v[i + 2] == value)
                {
                    continue;
                }
            }
            if (v[i] != value)
            {
                if (v[i + 1] == value)
                {
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}
