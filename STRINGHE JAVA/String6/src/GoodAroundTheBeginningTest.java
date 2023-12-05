import static org.junit.jupiter.api.Assertions.*;

class GoodAroundTheBeginningTest {

    @org.junit.jupiter.api.Test
    void goodAroundTheBeginning() {
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("good Sweet"));
        assertTrue(GoodAroundTheBeginning.goodAroundTheBeginning("_good Sweet"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("__good Sweet"));
        assertFalse(GoodAroundTheBeginning.goodAroundTheBeginning("goo"));

    }
}