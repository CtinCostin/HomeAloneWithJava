package main.java.com.georgescuconstantin.designpatterns.creationals.prototype;

public class Cat extends Animal {

    public boolean hasHair;

    public Cat() {
    }


    public Cat(Cat source) {
        super(source);
        if (source != null) {
            this.hasHair = source.hasHair;
        }
    }

    @Override
    Animal cloneAnimal() {
        return new Cat(this);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasHair=" + hasHair +
                '}';
    }
}
