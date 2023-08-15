package main.java.com.georgescuconstantin.designpatterns.solid.liskovsubstitution;

public class Car extends VehicleWithEngine{

    @Override
    void startEngine(){
        System.out.println("Car start the engine");

    }
}
