package org.array.leetcode;

public class Question1768 {
    public String mergeAlternately(String word1, String word2) {
        String arr="";
        int i=0,j=0,step=0;
        while(i<word1.length()&&j<word2.length()){
            if(step%2==0){
                arr+=word1.substring(i,i+1);
                i++;
            }else{
                arr+=word2.substring(j,j+1);
                j++;
            }
            step++;
        }
        if(i<word1.length())
            arr+=word1.substring(i);
        else
            arr+=word2.substring(j);
        return arr;
    }
}
