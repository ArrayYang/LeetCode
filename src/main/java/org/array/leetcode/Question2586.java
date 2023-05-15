package org.array.leetcode;

import java.util.HashSet;

public class Question2586 {
    public int vowelStrings(String[] words, int left, int right) {
        int total=0;
        for(int i=left;i<=right;i++)
            if(judge(words[i]))
                total++;
        return total;
    }

    private boolean judge(String word) {
        HashSet<Character> characters=new HashSet<>();
        characters.add('a');
        characters.add('e');
        characters.add('i');
        characters.add('o');
        characters.add('u');
        if(characters.contains(word.charAt(0))&&characters.contains(word.charAt(word.length()-1)))
            return true;
        else
            return false;
    }
}
