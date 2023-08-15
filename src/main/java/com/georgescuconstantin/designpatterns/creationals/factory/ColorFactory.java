package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class ColorFactory {

    public Shape colorShape(Shape shape, String color) {
        shape.setColor(color);
        return shape;
    }
}
