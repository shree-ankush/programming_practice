package org.akv.two_pointers;

import org.akv.two_pointers.easy.CountPairsWhoseSumIsThanTarget;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPairsWhoseSumIsThanTargetTest {


    @Test
    void testCountPairsWithLoop() {
        CountPairsWhoseSumIsThanTarget obj = new CountPairsWhoseSumIsThanTarget();
        assertEquals(3, obj.countPairsWithLoop(new int[]{-1, 1, 2, 3, 1}, 2));
        assertEquals(0, obj.countPairsWithLoop(new int[]{-1, 1, 2, 3, 1}, -2));
        assertEquals(10, obj.countPairsWithLoop(new int[]{-6, 2, 5, -2, -7, -1, 3}, -2));

    }
}