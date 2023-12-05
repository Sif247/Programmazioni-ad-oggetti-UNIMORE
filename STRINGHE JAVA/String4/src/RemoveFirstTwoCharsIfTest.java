import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstTwoCharsIfTest {

    @org.junit.jupiter.api.Test
    public void removeFirstTwoCharsIf() {
        assertEquals("Hello World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Hello World!"));
        assertEquals("od World!", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Good World!"));
        assertEquals("H", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Ho"));
        assertEquals("e", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Ne"));
        assertEquals("", RemoveFirstTwoCharsIf.removeFirstTwoCharsIf("Y"));
    }
}