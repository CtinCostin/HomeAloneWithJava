package main.java.com.georgescuconstantin.exercises.javaAdvanced.arrays;

import java.util.Scanner;

public class BubbleSortAlgorithm {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Insert the numbers of array to sort: ");
        number = scanner.nextInt();
        int array[] = new int[number];
        System.out.println("Enter " + number + " integers: ");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < number - 1; i++) {
            for (int j = 0; j < number - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted list of integers is: ");
        for (int i = 0; i < number; i++) {
            System.out.println(array[i]);
        }
    }
}
