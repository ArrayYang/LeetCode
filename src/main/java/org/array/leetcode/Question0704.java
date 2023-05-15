package org.array.leetcode;

public class Question0704 {
    public int search(int[] nums, int target) {
        if(target<nums[0]||target>nums[nums.length-1])
            return -1;
        else{
            int prior=0,tail=nums.length;
            int mid=0;
            while(tail>=prior){
                mid=(tail+prior)/2;
                if(nums[mid]==target){
                    break;
                }
                if(nums[mid]>target){
                    tail=mid-1;
                }
                if(nums[mid]<target){
                    prior=mid+1;
                }
            }
            if(tail>=prior)
                return mid;
            else
                return -1;
        }
    }
}
