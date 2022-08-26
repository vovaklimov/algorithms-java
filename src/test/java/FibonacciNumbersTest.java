import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FibonacciNumbersTest {
    private static final int[] fibonacciNumbers =
            new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711};

    @Test
    void shouldReturnCorrectValues() {
        int[] generatedValues = IntStream.rangeClosed(1, fibonacciNumbers.length)
                .map(FibonacciNumbers::get)
                .toArray();

        assertArrayEquals(fibonacciNumbers, generatedValues);
    }
}
