package org.array.leetcode;

public class Question0258 {
    public int addDigits(int num) {
        int count = 0, number = num;
        if (number < 10)
            count = num;
        while (number >= 10) {
            count = 0;
            while (number > 0) {
                count += number % 10;
                number = number / 10;
            }
            if (count >= 10)
                number = count;
            else
                break;
        }
        return count;
    }
}
