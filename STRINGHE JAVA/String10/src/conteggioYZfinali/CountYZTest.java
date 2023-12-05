package conteggioYZfinali;

import static org.junit.jupiter.api.Assertions.*;

class CountYZTest {

    @org.junit.jupiter.api.Test
    void countYZ() {
        assertEquals(2, CountYZ.countYZ("fez day"));
        assertEquals(2, CountYZ.countYZ("day fez"));
        assertEquals(2, CountYZ.countYZ("day fyyyz"));
    }
}