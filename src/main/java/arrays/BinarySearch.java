package arrays;

import java.util.Optional;

public class BinarySearch {
    public static Optional<Integer> search(int[] sortedArray, int element) {
        int left = 0;
        int right = sortedArray.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;
            int guess = sortedArray[middle];

            if (guess == element) return Optional.of(middle);

            if (element > guess) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return Optional.empty();
    }
}
