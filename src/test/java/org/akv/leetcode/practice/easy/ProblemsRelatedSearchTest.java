package org.akv.leetcode.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchImplementationTest {

    BinarySearchImplementation binarySearch = new BinarySearchImplementation();

    @Test
    void findIndexOfTarget() {
        assertEquals(1, binarySearch.findIndexOfTarget(new int[]{1, 2, 3, 4}, 2));
        assertEquals(-1, binarySearch.findIndexOfTarget(new int[]{11, 12, 13, 14}, 16));
        assertEquals(0, binarySearch.findIndexOfTarget(new int[]{11, 12, 13, 14}, 11));
        assertEquals(3, binarySearch.findIndexOfTarget(new int[]{11, 12, 13, 14}, 14));
        assertEquals(-1, binarySearch.findIndexOfTarget(new int[]{}, 12));
    }

    @Test
    void testBinarySearch() {
        assertTrue(binarySearch.isTargetPresent(2, new int[]{1, 2, 3, 4}));
        assertFalse(binarySearch.isTargetPresent(16, new int[]{11, 12, 13, 14}));
        assertTrue(binarySearch.isTargetPresent(12, new int[]{11, 12, 13, 14}));
        assertTrue(binarySearch.isTargetPresent(11, new int[]{11, 12, 13, 14}));
        assertTrue(binarySearch.isTargetPresent(14, new int[]{11, 12, 13, 14}));
        assertTrue(binarySearch.isTargetPresent(12, new int[]{11, 12, 13}));
        assertFalse(binarySearch.isTargetPresent(12, new int[]{}));

    }

    @Test
    void checkIfNumAndDoubleExist() {
        assertTrue(binarySearch.checkIfNumAndDoublePresent(new int[]{10, 20, 3, 4}));
        assertFalse(binarySearch.checkIfNumAndDoublePresent(new int[]{3, 1, 7, 11}));
        assertFalse(binarySearch.checkIfNumAndDoublePresent(new int[]{-2, 0, 10, -19, 4, 6, -8}));


    }
    @Test
    void searchIndexOfTargetElseReturnInsertIndex() {
        assertEquals(2,binarySearch.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},5));
        assertEquals(4,binarySearch.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},7));
        assertEquals(1,binarySearch.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},2));
        assertEquals(0,binarySearch.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},0));

    }


}