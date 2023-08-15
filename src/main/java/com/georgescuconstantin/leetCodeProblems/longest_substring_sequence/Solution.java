package main.java.com.georgescuconstantin.leetCodeProblems.longest_substring_sequence;

public class Solution {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcd"));

    }

    public static int lengthOfLongestSubstring(String s) {

        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            StringBuilder currentSubstring = new StringBuilder();
            for (int j = i; j < s.length(); j++) {
                if (currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }
        return maxLength;
    }

    //get a solution more efficient in space and time complexity(removing the nested for loop)
//    public static int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//        Map<Character, Integer> visitedCharacters = new HashMap<>();
//
//        for (int right = 0, left = 0; right < s.length(); right++) {
//            char currentCharacter = s.charAt(right);
//            if (visitedCharacters.containsKey(currentCharacter) &&
//                    visitedCharacters.get(currentCharacter) >= left) {
//                left = visitedCharacters.get(currentCharacter) + 1;
//            }
//            maxLength = Math.max(maxLength, right - left + 1);
//            visitedCharacters.put(currentCharacter, right);
//        }
//        return maxLength;
//    }

    // and more efficient
//    public static int lengthOfLongestSubstring(String s) {
//        int maxLength = 0;
//
//        for (int right = 0, left = 0; right < s.length(); right++) {
//            int indexOfFirstAppearanceInSubstring = s.indexOf(s.charAt(right), left);
//            if (indexOfFirstAppearanceInSubstring != right) {
//                left = indexOfFirstAppearanceInSubstring + 1;
//            }
//            maxLength = Math.max(maxLength, right - left + 1);
//        }
//        return maxLength;
//    }
}

/**
 * "a b c a b c d"
 */
