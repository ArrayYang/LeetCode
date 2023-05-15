package org.competition.week342;

public class Question1 {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime+delayedTime)%24;
    }
}
