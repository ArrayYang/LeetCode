package org.array.leetcode;

import java.util.Arrays;

public class Question0977 {
    public int[] sortedSquares(int[] nums) {
        int[] new_nums=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            new_nums[i]=nums[i]*nums[i];
        Arrays.sort(new_nums);
        return new_nums;
}
}
