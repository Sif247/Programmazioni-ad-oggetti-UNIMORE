package divisore;

import static org.junit.jupiter.api.Assertions.*;

class SplitterTest {

    @org.junit.jupiter.api.Test
    void splitter() {
        assertArrayEquals(new int[]{2, 3, 4, 4, 5, 6}, Splitter.splitter(234456));
        assertArrayEquals(new int[]{9, 8, 7, 6, 5, 4}, Splitter.splitter(987654));
    }
}