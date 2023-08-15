package main.java.com.georgescuconstantin.exercises.fundamentals;

public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getArea() {
        return a * b;
    }

    public int getPerimeter() {
        return 2 * a + 2 * b;
    }
}
