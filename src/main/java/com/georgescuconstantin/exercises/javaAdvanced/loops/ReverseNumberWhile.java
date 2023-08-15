package main.java.com.georgescuconstantin.exercises.javaAdvanced.loops;

import java.util.Scanner;

public class ReverseNumberWhile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long num = 0;
        long reverseNum = 0;
        System.out.println("Insert your number and press enter: ");
        num = scanner.nextLong();
        while (num != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + num % 10;
            num = num / 10;
        }
        System.out.println("Reverse of input number is: " + reverseNum);
    }
}
