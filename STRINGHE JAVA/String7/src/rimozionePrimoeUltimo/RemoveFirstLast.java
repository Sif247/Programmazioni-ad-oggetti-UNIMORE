package rimozionePrimoeUltimo;

public class RemoveFirstLast {
    public static String removeFirstLast(String s)
    {
        int dimensione = s.length();
        if(dimensione == 1)
        {
            return s;
        }

        int dimensione_piccola = dimensione - 1;
        StringBuilder sb = new StringBuilder();

        char first = s.charAt(0);
        char last = s.charAt(dimensione_piccola);


        if(first == last)
        {
            for(int i = 1; i < dimensione_piccola; i++)
            {
                sb.append(s.charAt(i));
            }
        }
        else
        {
            return s;
        }

        return sb.toString();
    }
}

