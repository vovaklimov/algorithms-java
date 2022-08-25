package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSort {
    static int[] sort(int[] rawArray) {
        int size = rawArray.length;
        int[] sortedArray = new int[size];
        List<Integer> array = Arrays.stream(rawArray)
                .boxed()
                .collect(Collectors.toList());

        for (int i = 0; i < size; i++) {
            int currentSmallestIdx = 0;
            int currentSmallest = array.get(currentSmallestIdx);
            for (int j = 0; j < array.size(); j++) {
                if (array.get(j) < currentSmallest) {
                    currentSmallest = array.get(j);
                    currentSmallestIdx = j;
                }
            }

            sortedArray[i] = currentSmallest;
            array.remove(currentSmallestIdx);
        }

        return sortedArray;
    }
}
