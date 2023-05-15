package org.array.leetcode;

public class Question0067 {
    public String addBinary(String a, String b) {
        StringBuilder number = new StringBuilder();
        char[] aChar = a.toCharArray();
        char[] bChar = b.toCharArray();
        int i = aChar.length - 1, j = bChar.length - 1;
        int step = 0;
        while (i >= 0 && j >= 0) {
            int k = Integer.parseInt(String.valueOf(aChar[i])) + Integer.parseInt(String.valueOf(bChar[j])) + step;
            if (k >= 2) {
                step = 1;
                k = k % 2;
                number.append(k);
            } else {
                step = 0;
                number.append(k);
            }
            i--;
            j--;
        }
        if (i >= 0) {
            while (i >= 0) {
                int k = Integer.parseInt(String.valueOf(aChar[i])) + step;
                if (k >= 2) {
                    step = 1;
                    k = k % 2;
                    number.append(k);
                } else {
                    step = 0;
                    number.append(k);
                }
                i--;
            }
        } else if (j >= 0) {
            while (j >= 0) {
                int k = Integer.parseInt(String.valueOf(bChar[j])) + step;
                if (k >= 2) {
                    step = 1;
                    k = k % 2;
                    number.append(k);
                } else {
                    step = 0;
                    number.append(k);
                }
                j--;
            }
        } else if (step == 1) {
            number.append(1);
            step = 0;
        }
        if (step == 1)
            number.append(1);
        return String.valueOf(number.reverse());
    }
}
