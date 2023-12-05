package Concatenate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {

    @Test
    void concatenate() {
        assertEquals("Non Mollare Mai", Concatenate.concatenate(new String[]{"Non"," ","Moll","are"," ","M","ai"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"H", "e", "llo", " ", "World!"}));
        assertEquals("Hello World!", Concatenate.concatenate(new String[]{"Hello World", "!"}));
    }
}