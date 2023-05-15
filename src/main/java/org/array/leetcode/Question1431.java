package org.array.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Question1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list=new ArrayList<>();
        int max=0;
        for(int i=0;i<candies.length;i++)
            if(max<candies[i])
                max=candies[i];
        for(int i=0;i<candies.length;i++)
            if(candies[i]+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        return list;
    }
}
