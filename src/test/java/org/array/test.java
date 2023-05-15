package org.array;

import org.array.leetcode.Question0064;
import org.array.leetcode.Question0162;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class test {
    @Test
    @DisplayName("test1")
    public void test1() {
        Question0064 q=new Question0064();
        int[][] grid={{1,2,3},{4,5,6}};
        Assertions.assertEquals(12,q.minPathSum(grid));
    }

    @Test
    @DisplayName("test2")
    public void test2(){
        int t=Integer.parseInt("asdbasd123456");
        System.out.println(t);
    }
}
