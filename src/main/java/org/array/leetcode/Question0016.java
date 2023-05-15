package org.array.leetcode;

import java.util.Arrays;

public class Question0016 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int best = 1000000;
        for (int first = 0; first < n; first++) {
            if (first > 0 && nums[first] == nums[first - 1])
                continue;
            int second = first + 1, third = n - 1;
            while (second < third) {
                int sum = nums[first] + nums[second] + nums[third];
                if (sum == target)
                    return target;
                if (Math.abs(sum - target) < Math.abs(best - target))
                    best = sum;
                if (sum > target) {
                    int k0 = third - 1;
                    while (second < k0 && nums[k0] == nums[third])
                        k0--;
                    third = k0;
                } else {
                    int j0 = second + 1;
                    while (j0 < third && nums[j0] == nums[second])
                        j0++;
                    second = j0;
                }
            }
        }
        return best;
    }
}
