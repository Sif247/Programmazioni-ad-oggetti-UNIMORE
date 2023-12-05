package Rimozione;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsTest {

    @org.junit.jupiter.api.Test
    void removeFirstTwoChars() {
        assertEquals("llo World!", RemoveFirstTwoChars.removeFirstTwoChars("Hello World!"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("No"));
        assertEquals("", RemoveFirstTwoChars.removeFirstTwoChars("Y"));
    }
}