package org.array.leetcode;

public class Question1309 {
    public String freqAlphabets(String s) {
        StringBuilder s1 = new StringBuilder("");
        int  length = s.length(),i=length-1;
        while (i >=0) {
            if(s.charAt(i)=='#'){
                s1=s1.append((char)(Integer.parseInt(s.substring(i-2,i))+'a'-1));
                i=i-3;
            }else{
                s1=s1.append((char)(Integer.parseInt(s.substring(i,i+1))+'a'-1));
                i=i-1;
            }
        }
        return String.valueOf(s1.reverse());
    }

}
