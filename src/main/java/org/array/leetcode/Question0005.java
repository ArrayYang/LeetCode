package org.array.leetcode;

public class Question0005 {
    public String longestPalindrome(String s) {
        int length=s.length();
        if(length<2)
            return s;
        int maxLen=1;
        int begin=0;
        boolean[][] dp=new boolean[length][length];
        for(int i=0;i<length;i++)
            dp[i][i]=true;
        char[] charArray=s.toCharArray();
        for(int i=2;i<=length;i++) {
            for (int j = 0; j < length; j++) {
                int k = i + j - 1;
                if (k >= length)
                    break;
                if (charArray[j] != charArray[k])
                    dp[j][k] = false;
                else if (k - j < 3)
                    dp[j][k] = true;
                else
                    dp[j][k] = dp[j + 1][k - 1];
                if (dp[j][k] && k - j + 1 > maxLen) {
                    maxLen=k-j+1;
                    begin=j;
                }
            }
        }
        return s.substring(begin,begin+maxLen);
    }
}
