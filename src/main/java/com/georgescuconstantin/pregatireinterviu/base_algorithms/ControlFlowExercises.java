package main.java.com.georgescuconstantin.pregatireinterviu.base_algorithms;

import java.util.Scanner;

public class ControlFlowExercises {

    public static void displayDigitsAndSum(int x) {
        int sum = 0;
        System.out.println("Digits of the number are: ");
        while (x > 0) {
            int lastDigit = x % 10;
            System.out.println(lastDigit + ", ");
            sum += lastDigit;
            x /= 10;
        }
        System.out.println();
        System.out.println("Sum of the digits is: " + sum);
    }

    public static void calculateAndPrintTheSmallestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number n: ");
        int n = scanner.nextInt();
        int crtNumber = scanner.nextInt();
        int minValue = crtNumber;
        int maxValue = crtNumber;
        double average = crtNumber;

        for (int i = 1; i < n; i++) {
            crtNumber = scanner.nextInt();
            average += crtNumber;
            if (minValue > crtNumber) {
                minValue = crtNumber;
            }
            if (maxValue < crtNumber) {
                maxValue = crtNumber;
            }
        }

        average /= n;

        System.out.println("The smallest number is: " + minValue);
        System.out.println("The biggest number is: " + maxValue);
        System.out.println("The average is: " + average);

    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void printPrimeNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number : ");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void printAllDivisorsForANumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number: ");
        int number = scanner.nextInt();
        boolean hasDivisor = false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                hasDivisor = true;
                System.out.println(i + " ");
            }
        }
        if (hasDivisor == false) {
            System.out.println("Este numar prim");
        }
    }
}



