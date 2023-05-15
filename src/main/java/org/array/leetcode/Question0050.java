package org.array.leetcode;

public class Question0050 {
    public double myPow(double x, int n) {
        double answer1 = Math.pow(x, n);
        double answer2 = 0.0;
        double answer3 = 0.0;
        long N = n;
        if (N >= 0) {
            answer2 = quickMul1(x, N);
            answer3 = quickMul2(x, N);
        } else {
            answer2 = 1.0 / quickMul1(x, -N);
            answer3 = 1.0 / quickMul2(x, -N);
        }
        return answer1;
    }

    private double quickMul1(double x, long n) {
        if (n == 0)
            return 1.0;
        double y = quickMul1(x, n / 2);
        return n % 2 == 0 ? y * y : y * x * y;
    }

    private double quickMul2(double x, long n) {
        double ans = 1.0;
        double x_tri = x;
        while (n > 0) {
            if (n % 2 == 1)
                ans *= x_tri;
            x_tri *= x_tri;
            n /= 2;
        }
        return ans;
    }
}
