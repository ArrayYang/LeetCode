package org.competition.doubleweek104;

import java.util.Arrays;

public class Question4 {
    final long MOD = (long) 1e9 + 7;

    public int sumOfPower(int[] nums) {
        Arrays.sort(nums);
        long ans = 0, s = 0;
        for (long x : nums) {
            ans = (ans + x * x % MOD * (x + s) % MOD);
            s = (s * 2 + x) % MOD;
        }
        return (int) ans;
    }
}
