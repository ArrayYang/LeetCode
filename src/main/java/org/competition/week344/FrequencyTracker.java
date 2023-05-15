package org.competition.week344;

import java.util.*;

public class FrequencyTracker {
    private int[] cnts;
    private int[] freq;
    public FrequencyTracker() {
        cnts = new int[100001];
        freq = new int[100001];
    }

    public void add(int number) {
        cnts[number]++;
        if(cnts[number]>1) {
            freq[cnts[number]-1]--;
        }
        freq[cnts[number]]++;
    }

    public void deleteOne(int number) {
        if(cnts[number]!=0) {
            freq[cnts[number]-1]++;
            freq[cnts[number]]--;
            cnts[number]--;
        }
    }

    public boolean hasFrequency(int frequency) {
        return freq[frequency]!=0;
    }
}

