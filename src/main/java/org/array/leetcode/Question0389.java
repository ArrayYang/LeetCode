package org.array.leetcode;

public class Question0389 {
    public char findTheDifference(String s, String t) {
        char ch = 0;
        int[] arr=new int[26];
        for(int i=0;i<t.length();i++)
            arr[t.charAt(i)-'a']++;
        for(int i=0;i<s.length();i++)
            arr[s.charAt(i)-'a']--;
        for(int i=0;i<26;i++)
            if(arr[i]!=0)
                ch= (char) ('a'+i);
        return ch;
    }
}
