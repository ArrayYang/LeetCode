package org.array.leetcode;

public class Question1137 {
    public int tribonacci(int n) {
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if(n==2)
            return 1;
        else{
            int[] arr=new int[n+1];
            arr[0]=0;
            arr[1]=1;
            arr[2]=1;
            for(int i=3;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
            }
            return arr[n];
        }
    }
}
