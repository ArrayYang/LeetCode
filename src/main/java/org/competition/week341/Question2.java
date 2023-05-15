package org.competition.week341;

public class Question2 {
    public int maxDivScore(int[] nums, int[] divisors) {
        int[] arr=new int[divisors.length];
        for(int i=0;i<divisors.length;i++){
            arr[i]=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]%divisors[i]==0)
                    arr[i]++;
            }
        }
        int max=0,number=1000000001;
        for(int i=0;i<divisors.length;i++){
            if(arr[i]>max){
                max=arr[i];
                number=divisors[i];
            }else if(arr[i]==max && number>divisors[i])
                number=divisors[i];
        }
        return number;
    }
}
