package org.akv.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsRelatedBinarySearchTest {

    ProblemsRelatedBinarySearch probs  = new ProblemsRelatedBinarySearch();

    @Test
    void binarySearch() {
         assertEquals(1,probs.binarySearch(new int [] {1,2,3,4},2));
        assertEquals(-1,probs.binarySearch(new int [] {11,12,13,14},16));
        assertEquals(1,probs.binarySearch(new int [] {11,12,13,14},12));
        assertEquals(0,probs.binarySearch(new int [] {11,12,13,14},11));
        assertEquals(3,probs.binarySearch(new int [] {11,12,13,14},14));
        assertEquals(-1,probs.binarySearch(new int [] {},12));
    }

    @Test
    void testBinarySearch() {
        assertTrue(probs.binarySearch(2,new int [] {1,2,3,4}));
        assertFalse(probs.binarySearch(16,new int [] {11,12,13,14}));
        assertTrue(probs.binarySearch(12,new int [] {11,12,13,14}));
        assertTrue(probs.binarySearch(11,new int [] {11,12,13,14}));
        assertTrue(probs.binarySearch(14,new int [] {11,12,13,14}));
        assertTrue(probs.binarySearch(12,new int [] {11,12,13}));
        assertFalse( probs.binarySearch(12,new int [] {}));

    }

    @Test
    void checkIfNumAndDoubleExists() {
        assertTrue(probs.checkIfNumAndDoubleExists(new int [] {10,20,3,4}));
        assertFalse(probs.checkIfNumAndDoubleExists(new int [] {3,1,7,11}));
       assertFalse(probs.checkIfNumAndDoubleExists(new int [] {-2,0,10,-19,4,6,-8}));


    }


}