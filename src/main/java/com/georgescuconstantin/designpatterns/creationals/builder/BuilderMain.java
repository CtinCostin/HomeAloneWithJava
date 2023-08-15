package main.java.com.georgescuconstantin.designpatterns.creationals.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Car car = new Car.CarBuilder("Electric")
                .setAcType("Automatic")
                .setAutoPilot(true)
                .setHeatChairs(true)
                .setNumberOfAirbags(10)
                .setPanoramicTop(false)
                .build();
        System.out.println(car);
    }
}
