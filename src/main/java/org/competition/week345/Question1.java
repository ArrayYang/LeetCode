package org.competition.week345;

public class Question1 {
    public int[] circularGameLosers(int n, int k) {
        if(n==1){
            return new int[0];
        }
        int[] people=new int[n+1];
        for(int i=1;i<=n;i++)
            people[i]=0;
        int step=k;
        people[1]=1;
        int position=1;
        while(true){
            position=(position+step);
            if(position>n && position % n !=0){
                position=position%n;
            }else if(position>=n && position % n ==0){
                position=n;
            }
            people[position]++;
            step+=k;
            if(judge(people,n))
                break;
        }
        int number=count(people,n);
        int[] no=new int[number];
        int pos=0;
        for(int i=1;i<=n;i++)
            if(people[i]==0){
                no[pos]=i;
                pos++;
            }
        return no;
    }

    private int count(int[] people, int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(people[i]==0)
                count++;
        }
        return count;
    }

    private boolean judge(int[] people,int n) {
        for(int i=1;i<=n;i++)
            if(people[i]==2)
                return true;
        return false;
    }
}
