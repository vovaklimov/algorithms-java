package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTest {

    @Test
    void shouldFindElementInSortedArray() {
        int[] sortedIntArray = new int[]{1, 2, 3, 4};

        assertEquals(3, BinarySearch.search(sortedIntArray, 4).orElseThrow());
        assertEquals(0, BinarySearch.search(sortedIntArray, 1).orElseThrow());
    }

    @Test
    void shouldReturnEmptyWhenElementNotFound() {
        int[] array = new int[]{1, 2, 3};
        var searchedElement = 4;

        assertTrue(BinarySearch.search(array, searchedElement).isEmpty());
    }

    @Test
    void shouldReturnEmptyOptionalWhenArrayEmpty() {
        int[] emptyArray = new int[0];

        assertTrue(BinarySearch.search(emptyArray, 0).isEmpty());
    }
}
