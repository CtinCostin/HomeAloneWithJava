package main.java.com.georgescuconstantin.leetCodeProblems.valid_palindrome;

import java.util.List;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {

        String lowerCaseString = s.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lowerCaseString.length(); i++) {
            Character currentChar = lowerCaseString.charAt(i);
            if (Character.isLetter(currentChar) || Character.isDigit(currentChar)) {
                stringBuilder.append(currentChar);
            }
        }

        String onlyLettersString = stringBuilder.toString();
        String reverseOnlyLettersString = stringBuilder.reverse().toString();
        return onlyLettersString.equalsIgnoreCase(reverseOnlyLettersString);
    }

    //another solution without String Builder Class

//    public static boolean isPalindrome(String s) {
//
//        String onlyLettersAndDigits = "";
//        for (char c : s.toCharArray()) {
//            if (Character.isLetter(c) || Character.isDigit(c)) {
//                onlyLettersAndDigits += c;
//            }
//        }
//
//        onlyLettersAndDigits = onlyLettersAndDigits.toLowerCase();
//
//        int front = 0;
//        int back = onlyLettersAndDigits.length() - 1;
//        while (front <= back) {
//            if (onlyLettersAndDigits.charAt(front) != onlyLettersAndDigits.charAt(back)) {
//                return false;
//            }
//            front ++;
//            back --;
//        }
//        return true;
//    }
}
