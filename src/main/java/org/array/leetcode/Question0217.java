package org.array.leetcode;

import java.util.*;

public class Question0217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int t=0;
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]==nums[i+1])
                t=1;
        if(t==1)
            return(true);
        else
            return(false);
    }
}
