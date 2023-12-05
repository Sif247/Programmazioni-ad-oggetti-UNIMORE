package conteggioYZfinali;

public class CountYZ {
    public static int countYZ(String s)
    {
        int somma = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(i != s.length()-1 )
            {
                if(s.charAt(i) == 'y' && s.charAt(i + 1) == ' ')
                {
                    somma++;
                } else if (s.charAt(i) == 'z' && s.charAt(i + 1) == ' ')
                {
                    somma++;
                }
            }
            else if(i == s.length()-1)
            {
                if(s.charAt(s.length()-1) == 'z' || s.charAt(s.length()-1) == 'y' )
                {
                    somma++;
                }
            }
        }
        return somma;
    }
}
