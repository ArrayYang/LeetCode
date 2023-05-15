package org.array.leetcode;

public class Question0242 {
    public boolean isAnagram(String s, String t) {
        int[] letter1=new int[27];
        int[] letter2=new int[27];
        for(int i=0;i<27;i++){
            letter1[i]=0;
            letter2[i]=0;
        }
        int judge=1;
        for(int i=0;i<s.length();i++)
            letter1[s.charAt(i)-'a'+1]++;
        for(int i=0;i<t.length();i++)
            letter2[t.charAt(i)-'a'+1]++;
        for(int i=1;i<27;i++)
            if(letter1[i]==letter2[i]){}
            else
                judge=0;
        if(judge==0)
            return(false);
        else
            return(true);
    }
}
