package UgualeNot;

public class EqualIsNot
{
    public static boolean equalIsNot(String s)
    {
        int somma = 0;
        int indice = 0;

        while(true)
        {
            int ris = s.indexOf("not", indice + 1);
            if(ris>0)
            {
                somma++;
                if(ris + 3 < s.length())
                {
                    indice = ris;
                    continue;
                }
            }
            break;
        }

        if(somma % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
