package main.java.com.georgescuconstantin.designpatterns.solid.dependencyinversion;

public class MainDependencyInversion {

    public static void main(String[] args) {

        Courier fanCourier = new Courier();
        fanCourier.deliverPackage("Toy", new Bicycle());
        Van transporter = new Van();
        fanCourier.deliverPackage("Furniture", transporter);
    }
}
