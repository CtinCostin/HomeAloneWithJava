package main.java.com.georgescuconstantin.leetCodeProblems.valid_anagram;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram", "maganat"));

    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int i = 0; i < char1.length; i++) {
            if (char1[i] != char2[i]) {
                return false;
            }
        }
        return true;
    }
}
