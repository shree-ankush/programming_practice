package org.akv.two_pointers;

import org.akv.two_pointers.easy.FindNumberOfTripletWithSameDifference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumberOfTripletWithSameDifferenceTest {

    @Test
    void arithmeticTriplets() {
        FindNumberOfTripletWithSameDifference obj = new FindNumberOfTripletWithSameDifference();
        assertEquals(0, obj.arithmeticTriplets(new int[]{0, 2}, 2));
        assertEquals(2, obj.arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
        assertEquals(2, obj.arithmeticTriplets(new int[]{4, 5, 6, 7, 8, 9}, 2));
    }
}