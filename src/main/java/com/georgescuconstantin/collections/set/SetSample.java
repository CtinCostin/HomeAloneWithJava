package main.java.com.georgescuconstantin.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    public static void main(String[] args) {

        Set<String> brandCars = new HashSet<>();

        addCars(brandCars);

        printCars(brandCars);

        checkCar(brandCars);

        removeCar(brandCars);

    }

    private static void removeCar(Set<String> brandCars) {
        if(brandCars.contains("Citroen")){
            brandCars.remove("Citroen");
        }
        printCars(brandCars);
    }

    private static void checkCar(Set<String> brandCars) {
        if(brandCars.contains("Audi")){
            System.out.println("is present in set!");
        }
        else {
            brandCars.add("Audi");
        }
    }

    private static void addCars(Set<String> brandCars) {
        brandCars.add("Citroen");
        brandCars.add("Volvo");
        brandCars.add("Bmw");
        brandCars.add(null);
    }

    private static void printCars(Set<String> brandCars) {
        for (String car : brandCars) {
            System.out.println("Car : " + car);
        }
    }




}
