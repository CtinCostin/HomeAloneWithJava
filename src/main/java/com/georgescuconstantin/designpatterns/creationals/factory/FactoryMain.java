package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class FactoryMain {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.createShape(ShapeType.CIRCLE);
        Shape rectangle = factory.createShape(ShapeType.RECTANGLE);

        circle.draw();
        rectangle.draw();

        System.out.println("----------------------------------");

        ShapeAbstractFactory abstractFactory = new ShapeAbstractFactory();

        Shape square = abstractFactory.createShapeWithColor(ShapeType.SQUARE, "green");
        Shape otherCircle = abstractFactory.createShapeWithColor(ShapeType.CIRCLE, "red");
        square.draw();
        otherCircle.draw();
    }
}
