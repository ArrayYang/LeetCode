package org.array.leetcode;

public class Question2614 {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(nums[i][i]))
                if (max < nums[i][i])
                    max = nums[i][i];
            if (isPrime(nums[i][n - i - 1]))
                if (max < nums[i][n - i - 1])
                    max = nums[i][n - i - 1];
        }
        return max;
    }

    private boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
