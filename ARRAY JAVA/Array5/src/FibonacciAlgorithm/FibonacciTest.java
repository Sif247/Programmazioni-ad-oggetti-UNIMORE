package FibonacciAlgorithm;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @org.junit.jupiter.api.Test
    void fibonacci() {
        assertArrayEquals(new long[]{0}, Fibonacci.fibonacci(1));
        assertArrayEquals(new long[]{0, 1}, Fibonacci.fibonacci(2));
        assertArrayEquals(new long[]{0, 1, 1, 2, 3}, Fibonacci.fibonacci(5));
    }
}