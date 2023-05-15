package org.competition.week342;

public class Question4 {
    public int minOperations(int[] nums) {
        int length=nums.length,gcdAll=0,cnt1=0;
        for(int x:nums){
            gcdAll=gcd(gcdAll,x);
            if(x==1)
                cnt1++;
        }
        if(gcdAll>1) return -1;
        if(cnt1>0) return length-cnt1;
        int minSize=length;
        for(int i=0;i<length;i++){
            int g=0;
            for(int j=i;j<length;j++){
                g=gcd(g,nums[j]);
                if(g==1){
                    minSize=Math.min(minSize,j-i);
                    break;
                }
            }
        }
        return minSize+length-1;
    }

    private int gcd(int a, int b) {
        while (a!=0){
            int temp=a;
            a=b%a;
            b=temp;
        }
        return b;
    }
}
