package palindroma;

public class Palindrome {
    public static boolean isPalindrome(String s){

        int tmp = 0;

        for(int i = s.length() -1 ; i >= 0; --i)
        {
            char c_i = s.charAt(i);
            char c_tmp = s.charAt(tmp);

            if(c_i != c_tmp)
            {
                return false;
            }
            tmp++;
        }
        return true;
    }
}
