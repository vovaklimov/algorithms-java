package arrays;

import java.util.Optional;

public class BinarySearch {
    public static Optional<Integer> search(int[] sortedArray, int element) {
        int leftIdx = 0;
        int rightIdx = sortedArray.length - 1;
        int middle;

        while (rightIdx >= leftIdx) {
            middle = (leftIdx + rightIdx) / 2;
            int guess = sortedArray[middle];

            if (guess == element) return Optional.of(middle);

            if (element > guess) {
                leftIdx = middle + 1;
            } else {
                rightIdx = middle - 1;
            }
        }

        return Optional.empty();
    }
}
