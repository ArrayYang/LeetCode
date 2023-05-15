package org.competition.doubleweek103;

import java.util.Arrays;
import java.util.Comparator;

public class Question1 {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int x=nums[nums.length-1];
        return((x+x+k-1)*k/2);

    }
}
