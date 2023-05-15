package org.array.leetcode;

public class Question0028 {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        int n=haystack.length();
        int m=needle.length();
        haystack=" "+haystack;
        needle=" "+needle;
        char[] s=haystack.toCharArray();
        char[] p=needle.toCharArray();
        int[] next=new int[m+1];
        for(int i=2,j=0;i<=m;i++){
            while(j>0 && p[i]!=p[j+1])
                j=next[j];
            if(p[i]==p[j+1])
                j++;
            next[i]=j;
        }
        for(int i=1,j=0;i<=n;i++){
            while (j>0 && s[i]!=p[j+1])
                j=next[j];
            if(s[i]==p[j+1])
                j++;
            if(j==m)
                return i-m;
        }
        return -1;
    }
}
