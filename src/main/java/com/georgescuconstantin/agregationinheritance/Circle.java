package main.java.com.georgescuconstantin.agregationinheritance;

public class Circle extends Form {

    private float radius;

    public Circle() {

    }

    public Circle(float radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle : " + "color =  " + super.getColor() +
                " , Aria = " + this.getArea();
    }

}
