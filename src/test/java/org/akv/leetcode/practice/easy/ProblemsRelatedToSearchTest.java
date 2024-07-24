package org.akv.leetcode.practice.easy;

import org.junit.jupiter.api.Test;

class ProblemsRelatedToSearchTest {

    ProblemsRelatedToSearch p1 = new ProblemsRelatedToSearch();
    @Test
    void searchIndexOfTargetElseReturnInsertIndex() {
        p1.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},5);
        p1.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},7);
        p1.searchIndexOfTargetElseReturnInsertIndex(new int []{1,3,5,6},2);

    }
}