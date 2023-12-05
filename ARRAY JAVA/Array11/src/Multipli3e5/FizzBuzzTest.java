package Multipli3e5;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void fizzBuzz() {
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, FizzBuzz.fizzBuzz(1, 6));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7"}, FizzBuzz.fizzBuzz(1, 8));
        assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"}, FizzBuzz.fizzBuzz(1, 11));
    }
}