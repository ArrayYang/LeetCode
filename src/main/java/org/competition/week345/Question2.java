package org.competition.week345;

public class Question2 {
    public boolean doesValidArrayExist(int[] derived) {
        int target=derived[0];
        for(int i=1;i<derived.length;i++)
            target=target^derived[i];
        if(target==0)
            return true;
        else
            return false;
    }
}
