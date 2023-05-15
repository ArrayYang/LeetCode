package org.competition.week344;

public class Question3 {
    public int[] colorTheArray(int n, int[][] queries) {
        int q=queries.length,cnt=0;
        int[] ans=new int[q];
        int[] a=new int[n+2];
        for(int qi=0;qi<q;qi++){
            int i=queries[qi][0]+1,c=queries[qi][1];
            if(a[i]>0)
                cnt-=(a[i]==a[i-1]?1:0)+(a[i]==a[i+1]?1:0);
            a[i]=c;
            cnt+=(a[i]==a[i-1]?1:0)+(a[i]==a[i+1]?1:0);
            ans[qi]=cnt;
        }
        return ans;
    }
}
