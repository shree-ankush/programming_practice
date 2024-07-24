package org.akv.leetcode.practice.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemsRelatedSearchTest {

    ProblemsRelatedToSearch probs  = new ProblemsRelatedToSearch();

    @Test
    void findIndexOfTarget() {
         assertEquals(1,probs.findIndexOfTarget(new int [] {1,2,3,4},2));
        assertEquals(-1,probs.findIndexOfTarget(new int [] {11,12,13,14},16));
        assertEquals(1,probs.findIndexOfTarget(new int [] {11,12,13,14},12));
        assertEquals(0,probs.findIndexOfTarget(new int [] {11,12,13,14},11));
        assertEquals(3,probs.findIndexOfTarget(new int [] {11,12,13,14},14));
        assertEquals(-1,probs.findIndexOfTarget(new int [] {},12));
    }

    @Test
    void testBinarySearch() {
        assertTrue(probs.isTargetPresent(2,new int [] {1,2,3,4}));
        assertFalse(probs.isTargetPresent(16,new int [] {11,12,13,14}));
        assertTrue(probs.isTargetPresent(12,new int [] {11,12,13,14}));
        assertTrue(probs.isTargetPresent(11,new int [] {11,12,13,14}));
        assertTrue(probs.isTargetPresent(14,new int [] {11,12,13,14}));
        assertTrue(probs.isTargetPresent(12,new int [] {11,12,13}));
        assertFalse( probs.isTargetPresent(12,new int [] {}));

    }

    @Test
    void checkIfNumAndDoubleExists() {
        assertTrue(probs.checkIfNumAndDoubleExists(new int [] {10,20,3,4}));
        assertFalse(probs.checkIfNumAndDoubleExists(new int [] {3,1,7,11}));
       assertFalse(probs.checkIfNumAndDoubleExists(new int [] {-2,0,10,-19,4,6,-8}));


    }


}