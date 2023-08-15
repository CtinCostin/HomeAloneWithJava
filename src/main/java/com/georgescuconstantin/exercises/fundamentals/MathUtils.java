package main.java.com.georgescuconstantin.exercises.fundamentals;

public class MathUtils {

    public static int power(int x, int y) {
        int value = 1;
        for (int i = 0; i < y; i++) {
            value *= x;
        }
        return value;
    }

    public static int factorial(int a) {
        if (a < 0) {
            return 0;
        } else if (a == 0) {
            return 1;
        } else {
            int value = 1;
            for (int i = 1; i <= a; i++) {
                value = value * i;
            }
            return value;
        }
    }
}
