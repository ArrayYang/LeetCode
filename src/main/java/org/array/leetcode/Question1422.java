package org.array.leetcode;

public class Question1422 {
    public int maxScore(String s) {
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            int k=0;
            for(int j=0;j<=i;j++){
                if(s.charAt(j)=='0')
                    k++;
            }
            for(int t=i+1;t<s.length();t++){
                if(s.charAt(t)=='1')
                    k++;
            }
            if(k>max)
                max=k;
        }
        return max;
    }
}
