package main.java.com.georgescuconstantin.pregatireinterviu.base_algorithms;

import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[1000];
        
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10000);
        }

        System.out.println("Before sorting: ");
        printArray(numbers);
        
        insertionSort(numbers);

        System.out.println("\nAfter sorting: ");
        printArray(numbers);
    }

    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];
            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
