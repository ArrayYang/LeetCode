package org.array.leetcode;

public class Question0080 {
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        if(length<=2){
            return length;
        }
        int slow=2,fast=2;
        while(fast<length){
            if(nums[slow-2]!=nums[fast]){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
