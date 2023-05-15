package org.competition.doubleweek103;

public class Question2 {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int[] c=new int[n];
        int[] a1=new int[n+1];
        int[] b1=new int[n+1];
        int t=0;
        for(int i=0;i<n;i++){
            for(int k=0;k<n+1;k++){
                a1[k]=0;
                b1[k]=0;
            }
            for(int j=0;j<=i;j++){
                a1[A[j]]++;
                b1[B[j]]++;
            }
            int s=0;
            for(int k=0;k<n+1;k++)
                if(a1[k]==1 && b1[k]==1)
                    s++;
            c[t]=s;
            t++;
        }
        return c;
    }
}
