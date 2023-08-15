package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class Circle extends ParentShape{

    @Override
    public void draw() {
        System.out.println("Drawing circle with color : " + color);

    }
}
