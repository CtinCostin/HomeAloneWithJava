package main.java.com.georgescuconstantin.exercises.fundamentals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataTypes {

    public static void main(String[] args) {
        calculate();
        showVariables();
        displayValues();
        displayResult();
        displayText();
        compareStrings();
        isEvenOrOdd();
        isGreaterOrElse();
        //displayNumbers();
        //displayNumbersWithWhile();
        //displayNumbersDivisibleBy5();
        //displaySumOfFactors();
        //displayStars();
        // displayNamesInTable();
        //displayIntegerInTable();
        //display2DimensionalTable();
        //displayInMatrix();
        DataTypes dataTypes = new DataTypes();
        String[] names = new String[]{"ion", "gigi", "vasile", "costica", "gigi"};
        System.out.println(dataTypes.getDistinct(names));
        System.out.println("Sum for 1 parameter: " + sumWithVarargs(5));
        System.out.println("Sum for 2 parameter: " + sumWithVarargs(5, 6));
        System.out.println("Sum for 3 parameter: " + sumWithVarargs(5, 6, 7));
        System.out.println("Sum for 4 parameter: " + sumWithVarargs(5, 6, 7, 8));

        LocalDate date = LocalDate.of(2022, 04, 05);
        System.out.println("Date " + date + " is earlier than now: " + isEarlierThanNow(date));
    }

    public static void calculate() {
        long a = 20l;
        long b = 10l;
        long c = 5l;
        long result1 = a * b / c;
        System.out.println(result1);
        System.out.println("---------------------");
    }

    public static void showVariables() {
        final int finalInt = 7;
        final float finalFloat = 19f;
        final long finalLong = 20L;
        final String finalString = "final string";
        final boolean finalBoolean = true;
        final char finalChar = 'c';
        System.out.println(finalInt);
        System.out.println(finalFloat);
        System.out.println(finalLong);
        System.out.println(finalString);
        System.out.println(finalBoolean);
        System.out.println(finalChar);
        System.out.println("--------------------------");


    }

    public static void displayValues() {
        System.out.println(2 * 2 >= 3 && 1 == 1);
        System.out.println(12 / 4 != 3);
        System.out.println(12 % 4 != 0);
        System.out.println(3 != 4 || (2 + 3 > 5));
        System.out.println("--------------------------");
    }

    public static void displayResult() {
        int intVar1 = 3;
        int intVar2 = 7;
        short shortSum = (short) (intVar1 + intVar2);
        //short shortSum2 = shortSum++;
        System.out.println(shortSum);
        System.out.println(++shortSum);
        byte byteSum = (byte) (intVar1 + intVar2);
        System.out.println(byteSum);
        System.out.println(++byteSum);
        System.out.println("-----------------------");
    }

    public static void displayText() {
        String firstName = "Coxtica ";
        String lastName = "George ";
        String nickName = "Plesuvul";
        String fullName = firstName + lastName + nickName;
        String fullName1 = firstName.concat(lastName).concat(nickName);
        System.out.println(fullName);
        System.out.println(fullName1);
        System.out.println("-------------------------");
    }

    public static void compareStrings() {
        String str1 = "good";
        String str2 = "good";
        boolean areEquals = str1.equals(str2);
        System.out.println(areEquals);
        System.out.println("-----------------------------");

    }

    public static void isEvenOrOdd() {
        int number = 9;
        if (number % 2 == 0) {
            System.out.println("is even");
        } else {
            System.out.println("is odd");
        }
        System.out.println("-------------------------");
    }

    public static void isGreaterOrElse() {
        int value = 5;
        if (value > 0) {
            System.out.println("great");
        } else if (value < 0) {
            System.out.println("small");
        } else if (value == 0) {
            System.out.println("equal");
        }
        System.out.println("-----------------------------");
    }

    public static void displayNumbers() {
        for (int i = 5; i < 101; i++) {
            System.out.println(i);
        }
        System.out.println("----------------------------");
    }

    public static void displayNumbersWithWhile() {
        int i = 5;
        while (i <= 100) {
            System.out.println(i++);
        }
    }

    public static void displayNumbersDivisibleBy5() {
        for (int i = 100; i >= 1; i = i - 5) {
            System.out.println(i);
        }
    }

    public static void displaySumOfFactors() {
        int sum = 0;
        for (int i = 5; i <= 460 * 2 + 1; i = i + 2) {
            sum = sum + i;

        }
        System.out.println(sum);


    }


    public static void displayStars() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void displayNamesInTable() {
        int n = 5;
        String[] names = new String[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name: ");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println("Hello " + names[i]);
        }
    }

    public static void displayIntegerInTable() {
        int n = 6;
        int[] integers = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Insert the number: ");
            integers[i] = scanner.nextInt();
        }
        float sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];

        }
        System.out.println("Arithmetic average: " + (sum / integers.length));
    }

    public static void display2DimensionalTable() {
        int n = 5;
        int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            table[i][i] = i;
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static void displayInMatrix() {
        int n = 2;
        int m = 3;
        int[][] matrix = new int[n][m];
        int val = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = val++;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("tab[" + i + "," + j + "]=" + matrix[i][j] + ";");
            }
            System.out.println();
        }
    }

    public int multiply(int x, int y, int z) {
        return x * y * z;
    }

    public String concatenateStrings(String name, String address, String cnp) {
        return name + address + cnp;
    }


    public String[] getDistinct(String[] names) {
        String[] out = new String[names.length];
        int k = 0;
        for (int i = 0; i < names.length; i++) {
            boolean found = false;
            for (int j = 0; j < out.length; j++) {
                if (names[i].equals(out[j])) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                out[k++] = names[i];
            }
        }
        return out;


    }

    public static int sumWithVarargs(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static boolean isEarlierThanNow(LocalDate date) {
        LocalDate now = LocalDate.now();
        System.out.println("Now is: " + now);

        return date.isBefore(now);
    }

    public static String[] checkEmails(String[] in) {
        Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");
        int j = 0;
        String[] out = new String[in.length];
        for (int i = 0; i < in.length; i++) {
            Matcher matcher = pattern.matcher(in[i]);
            if (matcher.matches()) {
                out[j++] = in[i];
            }
        }
        return out;
    }
}





