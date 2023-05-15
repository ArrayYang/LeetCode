package org.array.leetcode;

public class Question0053 {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i = 1;i < nums.length;i++){
            arr[i] = nums[i];
            if(arr[i-1]>0){
                arr[i] += arr[i-1];
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
