package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class ShapeAbstractFactory {

    private ShapeFactory shapeFactory;
    private ColorFactory colorFactory;

    public ShapeAbstractFactory() {
        shapeFactory = new ShapeFactory();
        colorFactory = new ColorFactory();
    }

    public Shape createShapeWithColor(ShapeType type, String color) {
        Shape shape = shapeFactory.createShape(type);
        return colorFactory.colorShape(shape, color);
    }
}
