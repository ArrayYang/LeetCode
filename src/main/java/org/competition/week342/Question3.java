package org.competition.week342;

public class Question3 {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int length = nums.length;
        int[] arr = new int[length - k + 1];
        int t = 0, step = 0;
        int[] test = new int[101];
        for (int i = 0; i < 101; i++)
            test[i] = 0;
        for (int i = 0; i < k; i++)
            test[nums[i] + 50]++;
        for (int i = 0; i < 101; i++) {
            if (test[i] != 0)
                step += test[i];
            if (step >= x) {
                if(i-50<0) {
                    arr[t] = i - 50;
                    t++;
                    break;
                }else {
                    arr[t]=0;
                    t++;
                    break;
                }
            }
        }
        for (int i = 1; i <= length - k; i++) {
            step=0;
            test[nums[i-1]+50]--;
            test[nums[i+k-1]+50]++;
            for (int j = 0; j < 101; j++) {
                if (test[j] != 0)
                    step += test[j];
                if (step >= x) {
                    if(j-50<0) {
                        arr[t] = j - 50;
                        t++;
                        break;
                    }else {
                        arr[t]=0;
                        t++;
                        break;
                    }
                }
            }
        }
        return arr;
    }
}
