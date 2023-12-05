package palindroma;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        assertFalse(Palindrome.isPalindrome("whistleblower"));
        assertTrue(Palindrome.isPalindrome("radar"));
        assertTrue(Palindrome.isPalindrome("r"));
        assertTrue(Palindrome.isPalindrome(""));

    }
}