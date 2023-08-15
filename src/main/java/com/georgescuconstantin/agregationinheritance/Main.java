package main.java.com.georgescuconstantin.agregationinheritance;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10 , 2 , "rosu");
        Circle circle = new Circle(2,"verde");
        System.out.println(triangle.toString());
        System.out.println(circle.toString());
    }
}
