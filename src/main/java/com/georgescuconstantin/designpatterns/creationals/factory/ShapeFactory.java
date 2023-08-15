package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class ShapeFactory {

    public Shape createShape(ShapeType type) {
        switch (type) {
            case CIRCLE:
                return new Circle();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                return new Circle();
        }
    }
}
