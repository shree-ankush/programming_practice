package org.akv.two_pointers;

import org.akv.two_pointers.easy.SquaresOfASortedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresOfASortedArrayTest {

    @Test
    void sortedSquares() {
        SquaresOfASortedArray obj = new SquaresOfASortedArray();
        assertArrayEquals(new int[]{0, 9, 16, 25, 100}, obj.sortedSquares(new int[]{-4, -3, 0, 5, 10}));
        assertArrayEquals(new int[]{1, 4, 9}, obj.sortedSquares(new int[]{-2, 1, 3}));

    }
}