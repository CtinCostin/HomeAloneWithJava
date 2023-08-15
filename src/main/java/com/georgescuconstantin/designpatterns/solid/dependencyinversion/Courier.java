package main.java.com.georgescuconstantin.designpatterns.solid.dependencyinversion;

public class Courier {

    public void deliverPackage(String packageName, Vehicle vehicle) {
        System.out.println("Take package");
        vehicle.ride();
        System.out.println("The package " + packageName + " is delivered");
    }
}
