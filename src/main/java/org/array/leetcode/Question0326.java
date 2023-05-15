package org.array.leetcode;

public class Question0326 {
    public boolean isPowerOfThree(int n) {
        int count = 0;
        if (n <= 0)
            return false;
        while (n > 0) {
            if (n % 3 != 0)
                count += n % 3;
            n = n / 3;
        }
        if (count != 1)
            return false;
        else
            return true;
    }
}
