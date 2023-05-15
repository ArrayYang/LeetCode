package org.array.leetcode;
/*给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出
和为目标值 target的两个整数，并返回它们的数组下标。
*/
public class Question0001 {
    public int[] twoSum(int[] nums, int target) {
        int[] location=new int[2];
        location[0]=0;location[1]=0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++)
                if(nums[i]+nums[j]==target){
                    location[0]=i;
                    location[1]=j;
                    break;
                }
            if(location[0]!=0 && location[1]!=0)
                break;
        }
        return(location);
    }
}
