package org.akv.two_pointers.easy;

public class PermutationsOfTheDiString {

    public int[] findPerms(String di) {
        int[] perm = new int[di.length() + 1];
        int high = di.length(), low = 0, i = 0;
        while (low < high) {
            if (di.charAt(i) == 'I') {
                perm[i] = low;
                low++;
            } else if (di.charAt(i) == 'D') {
                perm[i] = high;
                high--;
            }
            i++;
        }
        if (di.charAt(di.length() - 1) == 'I') {
            perm[i] = low;
        } else
            perm[i] = high;
        return perm;
    }
}
