package main.java.com.georgescuconstantin.designpatterns.solid.liskovsubstitution;

public class MainLiskovSbs {

    public static void main(String[] args) {

        VehicleWithoutEngine trek = new Bicycle();
        trek.startMoving();

        Engine engine = new Engine();
        VehicleWithEngine bmw = new Car();
        bmw.setEngine(engine);
        bmw.startEngine();
    }
}
