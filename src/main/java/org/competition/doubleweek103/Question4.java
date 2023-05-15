package org.competition.doubleweek103;

import java.util.Arrays;

public class Question4 {
    public long countOperationsToEmptyArray(int[] nums) {
        long total=nums.length;
        int j=0;
        int n=nums.length;
        int[] nums2=new int[n];
        for(int i=0;i<n;i++)
            nums2[i]=nums[i];
        Arrays.sort(nums2);
        for(int i=0;i<n;i++){
            for(j=0;j<n;j++)
                if(nums[j]==nums2[i])
                    break;
            if(j>i)
                total+=(j-i);
        }
        return total;
    }
}
