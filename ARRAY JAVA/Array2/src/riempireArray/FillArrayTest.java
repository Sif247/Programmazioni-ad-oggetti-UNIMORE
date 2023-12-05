package riempireArray;

import static org.junit.jupiter.api.Assertions.*;

class FillArrayTest {

    @org.junit.jupiter.api.Test
    void fillArray() {
        assertArrayEquals(new double[]{1, 1, 1}, FillArray.fillArray(3, 1.0, false));
        assertArrayEquals(new double[]{5, 5, 5, 5}, FillArray.fillArray(4, 5.0, false));
    }
}