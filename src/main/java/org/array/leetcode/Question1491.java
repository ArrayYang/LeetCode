package org.array.leetcode;

import java.util.*;

public class Question1491 {
    public double average(int[] salary) {
        double avg=0.0;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++)
            avg+=salary[i];
        return (avg/(salary.length-2));
    }
}
