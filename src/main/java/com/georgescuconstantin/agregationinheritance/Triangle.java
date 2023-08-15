package main.java.com.georgescuconstantin.agregationinheritance;

public class Triangle extends Form {

    private float height;
    private float base;

    public Triangle() {

    }

    public Triangle(float height, float base , String color) {
        super(color);
        this.height = height;
        this.base = base;

    }

    @Override
    public float getArea() {
        return (height * base) / 2;
    }

    @Override
    public String toString() {
        return "Triangle : " + "color =  " + super.getColor() +
                " , Aria = " + this.getArea();

    }
}


