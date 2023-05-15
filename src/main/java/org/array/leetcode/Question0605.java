package org.array.leetcode;

public class Question0605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==0 && n==0)
            return true;
        else if(flowerbed.length==0 && n!=0)
            return false;
        else if(flowerbed.length==1 && (n==0||n==1) && flowerbed[0]==0)
            return true;
        else if(flowerbed.length==1 && flowerbed[0]==1 && n!=0)
            return false;
        int total = 0;
        int position = 0;
        while (position < flowerbed.length) {
            if (position == 0 && flowerbed[0] == 0 && flowerbed[1] == 0) {
                total++;
                flowerbed[0] = 1;
            } else if (position == flowerbed.length - 1 && flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
                total++;
                flowerbed[flowerbed.length - 1] = 1;
            } else if (position != 0 && position != flowerbed.length - 1 && flowerbed[position] == 0 && flowerbed[position - 1] == 0 && flowerbed[position + 1] == 0) {
                total++;
                flowerbed[position] = 1;
            }
            position++;
        }
        if (total >= n)
            return true;
        else
            return false;
    }
}
