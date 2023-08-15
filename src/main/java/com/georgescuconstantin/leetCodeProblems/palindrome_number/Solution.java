package main.java.com.georgescuconstantin.leetCodeProblems.palindrome_number;

public class Solution {

    public static void main(String[] args) {

        System.out.println(isPalindromeNumber(234556432));
    }

        public static boolean isPalindromeNumber(int number) {

        if (number < 0) {
            return false;
        }
        int copy = number, reverse = 0;
        while (copy > 0) {
            int digit = copy % 10;
            reverse = reverse * 10 + digit;
             copy /= 10;
        }
        return reverse == number;
    }
}
