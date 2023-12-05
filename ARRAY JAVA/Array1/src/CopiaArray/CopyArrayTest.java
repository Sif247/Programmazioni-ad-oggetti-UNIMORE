package CopiaArray;

import static org.junit.jupiter.api.Assertions.*;

class CopyArrayTest {

    @org.junit.jupiter.api.Test
    void copyArray() {
        assertArrayEquals(new double[]{1, 1, 1}, CopyArray.copyArray(new double[]{1, 1, 1}));
        assertArrayEquals(new double[]{5, 4, 3, 1}, CopyArray.copyArray(new double[]{5, 4, 3, 1}));
    }
}