package main.java.com.georgescuconstantin.leetCodeProblems.valid_parantheses;

import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.isValid("{([])}()"));

    }

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> characters = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                characters.push(c);
            } else if (c == ')' && !characters.isEmpty() && characters.peek().equals('(')) {
                characters.pop();
            } else if (c == '}' && !characters.isEmpty() && characters.peek().equals('{')) {
                characters.pop();
            } else if (c == ']' && !characters.isEmpty() && characters.peek().equals('[')) {
                characters.pop();
            } else {
                return false;
            }
        }
        return characters.isEmpty();
    }
}
