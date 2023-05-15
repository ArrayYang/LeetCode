package org.array.leetcode;

import java.util.Arrays;

public class Question2404 {
    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        int pos = -1, total = 0;
        int[] arr = new int[50001];
        for (int i = 0; i <= 50000; i++)
            arr[i] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                arr[nums[i] / 2]++;
            }
        }
        for (int i = 0; i <= 50000; i++) {
            if (arr[i] > total) {
                pos = i * 2;
                total = arr[i];
            }
        }
        return pos;
    }
}
