package main.java.com.georgescuconstantin.designpatterns.creationals.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeMain {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        Cat british = new Cat();
        british.hasHair = true;
        animals.add(british);

        Animal maidaneza = british.cloneAnimal();
        animals.add(maidaneza);

        Elephant elephant = new Elephant();
        elephant.color = "blue";
        animals.add(elephant);

        System.out.println(animals);
    }
}
