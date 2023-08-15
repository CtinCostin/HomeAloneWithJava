package main.java.com.georgescuconstantin.designpatterns.solid.dependencyinversion;

public class Van implements Vehicle{

    @Override
    public void ride() {
        System.out.println("The van is moving");
    }
}
