package org.array.leetcode;
/*给你两个非负整数 low 和 high 。请你返回 low 和 high 之间（包括二者）奇数的数目。*/
public class Question1523 {
    public int countOdds(int low, int high) {
        if(low %2==0 && high %2==0)
            return((high-low)/2);
        else
            return((high-low)/2+1);
    }
}
