package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class Rectangle extends ParentShape {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with color : " + color);

    }
}
