package org.akv.two_pointers;

import org.akv.two_pointers.easy.FindFirstPallindromicStringInArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstPallindromicStringInArrayTest {

    @Test
    void firstPalindrome() {
        FindFirstPallindromicStringInArray findFirstPallindromicStringInArray = new FindFirstPallindromicStringInArray();
        assertEquals("", findFirstPallindromicStringInArray.firstPalindrome(new String[]{}));

        assertEquals("s", findFirstPallindromicStringInArray.firstPalindrome(new String[]{"s"}));

        assertEquals("", findFirstPallindromicStringInArray.firstPalindrome(new String[]{"sa", "sb"}));
        assertEquals("ss", findFirstPallindromicStringInArray.firstPalindrome(new String[]{"sa", "sb", "ss"}));


        assertEquals("ada", findFirstPallindromicStringInArray.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"}));
    }
}