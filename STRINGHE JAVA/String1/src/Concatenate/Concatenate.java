package Concatenate;

public class Concatenate {
    public static String concatenate(String[] strings) {
        StringBuilder stringa = new StringBuilder();
        for(String s : strings)
        {
            stringa.append(s);
        }
        return stringa.toString();
    }

}