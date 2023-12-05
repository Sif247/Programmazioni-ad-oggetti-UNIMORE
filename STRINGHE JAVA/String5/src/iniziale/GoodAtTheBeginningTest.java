package iniziale;

import static org.junit.jupiter.api.Assertions.*;

class GoodAtTheBeginningTest {

    @org.junit.jupiter.api.Test
    void goodAtTheBeginning() {

        assertTrue(GoodAtTheBeginning.goodAtTheBeginning("good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning(" good Sweet"));
        assertFalse(GoodAtTheBeginning.goodAtTheBeginning("goo"));
    }
}