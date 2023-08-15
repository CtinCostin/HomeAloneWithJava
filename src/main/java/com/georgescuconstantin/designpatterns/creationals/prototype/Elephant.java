package main.java.com.georgescuconstantin.designpatterns.creationals.prototype;

public class Elephant extends Animal{

    public String color;

    public Elephant(){

    }

    public Elephant(Elephant source) {
        super(source);
        if (source != null) {
            this.color = source.color;
        }
    }

    @Override
    Animal cloneAnimal() {
        return new Elephant(this);
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "color='" + color + '\'' +
                '}';
    }
}
