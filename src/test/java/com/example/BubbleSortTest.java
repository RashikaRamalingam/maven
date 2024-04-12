package com.example;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] inputArray = {5, 3, 1, 2, 4};
        int[] expectedArray = {1, 2, 3, 4, 5};

        BubbleSort.bubbleSort(inputArray);

        assertArrayEquals(expectedArray, inputArray);
    }
}
