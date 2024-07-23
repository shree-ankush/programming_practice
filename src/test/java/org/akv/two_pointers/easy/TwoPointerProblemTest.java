package org.akv.two_pointers.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointerProblemTest {

    TwoPointerProblem problem = new TwoPointerProblem();

    @Test
    void shortestDistanceToChar() {

        problem.shortestDistanceToChar("aabaaaaa", 'b');

        problem.shortestDistanceToChar("aaaaaabaaa", 'b');
        problem.shortestDistanceToChar("abaaaabaaa", 'b');
        problem.shortestDistanceToChar("abaabaabaaa", 'b');
        problem.shortestDistanceToChar("loveleetcode", 'e');
//[3,2,1,0,1,0,0,1,2,2,1,0]
    }


    @Test
    void findArrConcatValue() {

        assertEquals(247, problem.findArrConcatValue(new int[]{1, 2, 33, 4}));

        assertEquals(673, problem.findArrConcatValue(new int[]{5, 14, 13, 8, 12}));

        assertEquals(585, problem.findArrConcatValue(new int[]{1, 45, 2, 33}));
        assertEquals(11, problem.findArrConcatValue(new int[]{1, 1}));


    }
}