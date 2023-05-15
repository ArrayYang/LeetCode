package org.array.leetcode;

public class Question1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int pos=-1;
        int distance=100000;
        for(int i=0;i<points.length;i++){
            if(points[i][0]==x || points[i][1]==y){
                if(distance>(Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y))){
                    distance=Math.abs(points[i][0]-x)+Math.abs(points[i][1]-y);
                    pos=i;
                }
            }
        }
        return pos;
    }
}
