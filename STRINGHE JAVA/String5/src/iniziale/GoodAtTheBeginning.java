package iniziale;

public class GoodAtTheBeginning {
    public static boolean goodAtTheBeginning(String s)
    {
        boolean decisione;
        decisione = false;

        if(s.length() > 3)
        {
            if(s.charAt(0) == 'g' && s.charAt(1) == 'o' && s.charAt(2) == 'o' && s.charAt(3) == 'd')
            {
                decisione = true;
            }
        }


        return decisione;

    }
}
