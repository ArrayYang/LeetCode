package org.competition.week343;

public class Question2 {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int i;
        int[][] bool=new int[mat.length][mat[0].length];
        Init(bool,bool.length,bool[0].length);
        for(i=0;i<arr.length;i++){
            String s=search(mat,arr[i]);
            String[] s1=s.split(" ");
            int n=Integer.parseInt(s1[0]);
            int m=Integer.parseInt(s1[1]);
            System.out.println(n+" "+m);
            bool[n][m]=1;
            if(judge(bool,n,m))
                break;
        }
        return i;
    }

    private boolean judge(int[][] bool, int n, int m) {
        int t=0,i=0;
        for(i=0;i<bool[0].length;i++)
            if(bool[n][i]==0)
                break;
        if(i==bool[0].length)
            t=1;
        for(i=0;i<bool.length;i++)
            if(bool[i][m]==0)
                break;
        if(i==bool.length)
            t=1;
        if(t==1)
            return true;
        else
            return false;
    }

    private String search(int[][] mat, int target) {
        int i=0,j=0;
        for(i=0;i<mat.length;i++)
            for(j=0;j<mat[0].length;j++)
                if(mat[i][j]==target)
                    return i+" "+j;
        return "";
    }

    private void Init(int[][] bool, int n, int m) {
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                bool[i][j]=0;
    }
}
