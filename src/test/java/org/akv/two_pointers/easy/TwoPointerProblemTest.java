package org.akv.two_pointers.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoPointerProblemTest {

    TwoPointerProblem problem =new TwoPointerProblem();
    @Test
    void shortestDistanceToChar() {
        problem.shortestDistanceToChar("aabaaaa",'b');
    }
}