package main.java.com.georgescuconstantin.designpatterns.creationals.factory;

public abstract class ParentShape implements Shape{

    protected String color;

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
