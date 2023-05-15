package org.competition.week341;

public class Question3 {
    public int addMinimum(String word) {
        int min = 0;
        String[] arr = new String[7];
        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";
        arr[3] = "ab";
        arr[4] = "bc";
        arr[5] = "abc";
        arr[6] = "ac";
        int pos = 0;
        if (word.length() == 1) {
            return 2;
        } else if (word.length() == 2) {
            while (pos < word.length()) {
                if (pos + 2 <= word.length())
                    if (word.substring(pos, pos + 2).equals(arr[3]) || word.substring(pos, pos + 2).equals(arr[4]) || word.substring(pos, pos + 2).equals(arr[6])) {
                        pos = pos + 2;
                        min++;
                        continue;
                    }
                if (word.substring(pos, pos + 1).equals(arr[0]) || word.substring(pos, pos + 1).equals(arr[1]) || word.substring(pos, pos + 1).equals(arr[2])) {
                    pos++;
                    min = min + 2;
                }
            }
            return min;
        } else {
            while (pos < word.length()) {
                if (pos + 3 <= word.length())
                    if (word.substring(pos, pos + 3).equals(arr[5])) {
                        pos = pos + 3;
                        continue;
                    }
                if (pos + 2 <= word.length())
                    if (word.substring(pos, pos + 2).equals(arr[3]) || word.substring(pos, pos + 2).equals(arr[4])|| word.substring(pos, pos + 2).equals(arr[6])) {
                        pos = pos + 2;
                        min++;
                        continue;
                    }
                if (word.substring(pos, pos + 1).equals(arr[0]) || word.substring(pos, pos + 1).equals(arr[1]) || word.substring(pos, pos + 1).equals(arr[2])) {
                    pos++;
                    min = min + 2;
                }
            }
            return min;
        }
    }
}
