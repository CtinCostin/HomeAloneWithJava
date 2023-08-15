package main.java.com.georgescuconstantin.designpatterns.creationals.prototype;

public abstract class Animal {

    private String name;
    private String breed;
    private int numberOfFeet;

    public Animal() {
    }

    public Animal(Animal source) {
        if (source != null) {
            this.name = source.name;
            this.breed = source.breed;
            this.numberOfFeet = source.numberOfFeet;
        }
    }

    abstract Animal cloneAnimal();
}
