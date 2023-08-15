package main.java.com.georgescuconstantin.generictypes;

public class Cat <T extends Animal> {

    private T animal;

    public  Cat(T animal){
        this.animal = animal;
    }


}
