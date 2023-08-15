package main.java.com.georgescuconstantin.designpatterns.solid.dependencyinversion;

public class Bicycle implements Vehicle{
    @Override
    public void ride() {
        System.out.println("The bicycle is moving");
    }
}
