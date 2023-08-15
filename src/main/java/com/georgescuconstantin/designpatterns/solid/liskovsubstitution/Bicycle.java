package main.java.com.georgescuconstantin.designpatterns.solid.liskovsubstitution;

public class Bicycle extends VehicleWithoutEngine {

    @Override
    void startMoving() {
        System.out.println("Bike starts moving");

    }
}
