public class RemoveFirstTwoCharsIf {
    public static String removeFirstTwoCharsIf(String s){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < s.length(); ++i)
        {

            if( i == 0)
            {
                if(s.charAt(i) == 'H')
                {
                    sb.append("H");
                }
                continue;
            }
            if(i == 1)
            {
                if(s.charAt(1) == 'e')
                {
                    sb.append("e");
                }
                continue;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
