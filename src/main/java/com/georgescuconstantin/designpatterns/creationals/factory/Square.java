package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public class Square extends ParentShape{

    @Override
    public void draw() {
        System.out.println("Drawing square with color : " + color);
    }
}
