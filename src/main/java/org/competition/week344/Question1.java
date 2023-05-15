package org.competition.week344;

public class Question1 {
    public int[] distinctDifferenceArray(int[] nums) {
        int length=nums.length;
        int[] ans=new int[length];
        int[] prior=new int[51];
        int[] last=new int[51];
        for(int i=1;i<=50;i++) {
            prior[i] = 0;
            last[i] = 0;
        }
        for(int i=0;i<length;i++){
            for(int j=0;j<=i;j++)
                prior[nums[j]]=1;
            for(int j=i+1;j<length;j++)
                last[nums[j]]=1;
            int number=0;
            for(int j=1;j<=50;j++){
                if(prior[j]==1){
                    number++;
                    prior[j]=0;
                }
                if(last[j]==1){
                    number--;
                    last[j]=0;
                }
            }
            ans[i]=number;
        }
        return ans;
    }
}
