package main.java.com.georgescuconstantin.recursivecall;

public class RecursiveCall {

    public static void main(String[] args) {
        String binary = findBinary(500, "");
        System.out.println(binary);
        int result = recursion(7);
        System.out.println(result);
        System.out.println(reverseString("hello"));

    }

    public static String findBinary(int decimal, String result) {
        if (decimal == 0) {
            return result;
        }

        result = decimal % 2 + result;
        return findBinary(decimal / 2, result);

    }

    public static int recursion(int value) {
         if (value == 20) {
            return -1;
        }
        return recursion(value + 1);
    }

    public static String reverseString(String input) {
        if (input.equals("")) {
            return "";
        }
        return reverseString(input.substring(1)) + input.charAt(0);
    }
}

