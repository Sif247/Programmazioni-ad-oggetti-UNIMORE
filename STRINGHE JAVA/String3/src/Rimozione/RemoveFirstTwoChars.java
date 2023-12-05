package Rimozione;

public class RemoveFirstTwoChars {
    public static String removeFirstTwoChars(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 2; i < s.length(); ++i)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
