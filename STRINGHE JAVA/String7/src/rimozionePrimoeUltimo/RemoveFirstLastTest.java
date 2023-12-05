package rimozionePrimoeUltimo;

import static org.junit.jupiter.api.Assertions.*;

class RemoveFirstLastTest {

    @org.junit.jupiter.api.Test
    void removeFirstLast() {
        assertEquals("Google", RemoveFirstLast.removeFirstLast("Google"));
        assertEquals("oogl", RemoveFirstLast.removeFirstLast("eoogle"));
        assertEquals("", RemoveFirstLast.removeFirstLast("FF"));
        assertEquals("F", RemoveFirstLast.removeFirstLast("F"));
    }
}