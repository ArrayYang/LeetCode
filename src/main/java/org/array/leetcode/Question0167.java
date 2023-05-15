package org.array.leetcode;

public class Question0167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] pos=new int[2];
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]>target)
                j--;
            else if(numbers[i]+numbers[j]<target)
                i++;
            else
                break;
        }
        pos[0]=i+1;
        pos[1]=j+1;
        return pos;
    }
}
