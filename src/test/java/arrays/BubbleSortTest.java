package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {
    @Test
    void shouldSortArrayWithMultipleEntries() {
        int[] rawArray = new int[]{3, 2, 1, 5};
        int[] expectedSortedArray = Arrays.stream(rawArray).sorted().toArray();
        int[] sortedArray = BubbleSort.sort(rawArray);

        assertArrayEquals(expectedSortedArray, sortedArray);
    }

    @Test
    void shouldSortArrayWithOneEntry() {
        var arrayWithOneEntry = new int[]{1};

        var sorted = BubbleSort.sort(arrayWithOneEntry);

        assertArrayEquals(arrayWithOneEntry, sorted);
    }

    @Test
    void shouldReturnEmptyArrayWhenSortingEmptyArray() {
        var empty = new int[0];

        assertArrayEquals(empty, BubbleSort.sort(empty));
    }
}
