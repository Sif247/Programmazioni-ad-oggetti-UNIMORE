package DoppieOrdineAlfabetico;
import java.util.Arrays;
public class DuplicateChars {
    public static char[] duplicateChars(String s)
    {
        StringBuilder sb = new StringBuilder();

        if(s.length() == 2)
        {
            Character tmp = s.charAt(0);
            Character tmp2 = s.charAt(1);
            if(tmp == tmp2)
            {
                sb.append(s.charAt(0));
                char[] result = sb.toString().toCharArray();
                java.util.Arrays.sort(result);
                return result;
            }
        }

        for(int i = 0; i < s.length(); ++i)
        {
            for(int j = i + 1; j < s.length()-1;++j)
            {
                Character tmp = s.charAt(i);
                Character tmp2 = s.charAt(j);
                if(tmp == tmp2)
                {
                    sb.append(s.charAt(i));
                }

            }
        }

        char[] result = sb.toString().toCharArray();
        java.util.Arrays.sort(result);
        return result;
    }
}
