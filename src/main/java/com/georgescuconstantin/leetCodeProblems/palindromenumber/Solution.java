package main.java.com.georgescuconstantin.leetCodeProblems.palindromenumber;

public class Solution {

    public static void main(String[] args) {
        System.out.println(isPalindromeNumber(1223321));
    }


    public static boolean isPalindromeNumber(int number) {

        if (number < 0) {
            return false;
        }

        String stringNumber = number + "";
        int left = 0;
        int right = stringNumber.length() - 1;
        while (left < right) {
            if (stringNumber.charAt(left) != stringNumber.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/**
 *  A palindrome is a string that can be read either backwards the same as forwards
 *
 *
 *
 *
 *
 */
