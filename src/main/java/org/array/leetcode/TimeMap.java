package org.array.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TimeMap {
    class Pair implements Comparable<Pair> {
        int timestamp;
        String value;

        public Pair() {
        }

        public Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }

        public int hashCode() {
            return timestamp + value.hashCode();
        }

        public boolean equals(Object obj) {
            if (obj instanceof Pair) {
                Pair pair2 = (Pair) obj;
                return this.timestamp == pair2.timestamp && this.value.equals(pair2.value);
            }
            return false;
        }

        @Override
        public int compareTo(Pair pair2) {
            if (this.timestamp != pair2.timestamp) {
                return this.timestamp - pair2.timestamp;
            } else
                return this.value.compareTo(pair2.value);
        }
    }

    Map<String, List<Pair>> map;

    public TimeMap() {
        map = new HashMap<String, List<Pair>>();
    }

    public void set(String key, String value, int timestamp) {
        List<Pair> pairs = map.getOrDefault(key, new ArrayList<Pair>());
        pairs.add(new Pair(timestamp, value));
        map.put(key, pairs);
    }

    public String get(String key, int timestamp) {
        List<Pair> pairs = map.getOrDefault(key, new ArrayList<Pair>());
        Pair pair = new Pair(timestamp, String.valueOf((char) 127));
        int i = binarySearch(pairs, pair);
        if (i > 0) {
            return pairs.get(i - 1).value;
        }
        return "";
    }

    private int binarySearch(List<Pair> pairs, Pair target) {
        int low=0,high=pairs.size()-1;
        if(high<0 || pairs.get(high).compareTo(target)<=0){
            return high+1;
        }
        while (low < high){
            int mid=(high-low)/2 +low;
            Pair pair=pairs.get(mid);
            if(pair.compareTo(target)<=0){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
}
