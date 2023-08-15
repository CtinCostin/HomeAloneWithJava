package main.java.com.georgescuconstantin.designpatterns.solid.liskovsubstitution;

public class VehicleWithEngine extends TransportationVehicle{

    private Engine engine;

    void startEngine(){

    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
