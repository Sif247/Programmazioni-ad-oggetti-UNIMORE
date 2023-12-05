package UgualeNot;

import static org.junit.jupiter.api.Assertions.*;

class EqualIsNotTest {

    @org.junit.jupiter.api.Test
    void equalIsNot() {
        assertFalse(EqualIsNot.equalIsNot("This is not"));
        assertTrue(EqualIsNot.equalIsNot("This is notnot"));
        assertTrue(EqualIsNot.equalIsNot("noisxxnotyynotxisi"));
    }
}