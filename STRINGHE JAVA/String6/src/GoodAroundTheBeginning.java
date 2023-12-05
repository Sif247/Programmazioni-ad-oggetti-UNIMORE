public class GoodAroundTheBeginning {
    public static boolean goodAroundTheBeginning(String s)
    {
        boolean decision;

        decision = false;
        if(s.length() > 3)
        {
            if( s.charAt(0) == 'g' && s.charAt(1) == 'o' && s.charAt(2) == 'o' && s.charAt(3) == 'd')
            {
                decision = true;
            }
            else if(s.charAt(1) == 'g' && s.charAt(2) == 'o' && s.charAt(3) == 'o' && s.charAt(4) == 'd')
            {
                decision = true;
            }
        }

        return decision;
    }
}
