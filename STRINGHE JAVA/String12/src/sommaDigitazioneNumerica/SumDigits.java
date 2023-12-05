package sommaDigitazioneNumerica;

import static java.lang.Character.getNumericValue;
import static java.lang.Character.isDigit;

public class SumDigits {
    public static int sumDigits(String s)
    {
        int somma = 0;
        for(int i = 0; i < s.length();++i )
        {
            boolean answer = isDigit(s.charAt(i));
            if(answer == true)
            {
                Character tmp2 = s.charAt(i);
                int tmp = getNumericValue(tmp2);
                somma += tmp;
            }
        }
        return somma;
    }
}
