package org.array.leetcode;

public class Question2441 {
    public int findMaxK(int[] nums) {
        int[] number = new int[2001];
        for (int i = 0; i < 2001; i++)
            number[i] = 0;
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            number[nums[i] + 1000]++;
        }
        int start = 0, end = 2000;
        while (start < end) {
            if (number[start] > 0 && number[end] > 0) {
                max = end - 1000;
                break;
            } else {
                end--;
                start++;
            }
        }
        return max;
    }
}
