package OvunqueCoppia;

import static org.junit.jupiter.api.Assertions.*;

class IsEverywhereTest {

    @org.junit.jupiter.api.Test
    void isEverywhere() {
        assertTrue(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 1));
        assertFalse(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3}, 2));
        assertFalse(IsEverywhere.isEverywhere(new int[]{1, 2, 1, 3, 4}, 1));
    }
}