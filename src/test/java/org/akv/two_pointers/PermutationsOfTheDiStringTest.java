package org.akv.two_pointers;

import org.akv.two_pointers.easy.PermutationsOfTheDiString;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsOfTheDiStringTest {

    @Test
    void findPerms() {
        PermutationsOfTheDiString perms = new PermutationsOfTheDiString();
        assertEquals(new int[]{0,4,1,3,2},perms.findPerms("IDID"));
    }
}