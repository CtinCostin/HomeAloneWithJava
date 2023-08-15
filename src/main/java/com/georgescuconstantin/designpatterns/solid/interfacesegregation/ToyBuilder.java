package main.java.com.georgescuconstantin.designpatterns.solid.interfacesegregation;

public class ToyBuilder {

    public static ToyHouse buildToyHouse() {
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(25);
        toyHouse.setColor("green");
        return toyHouse;
    }

    public static ToyPlane buildToyPlane() {
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(35.5);
        toyPlane.setColor("yellow");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }

    public static ToyCar buildToyCar() {
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(21.7);
        toyCar.setColor("blue");
        toyCar.move();
        System.out.println("---------------------------" +
                "------------------------------");
        return toyCar;
    }
}
