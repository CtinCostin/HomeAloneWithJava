package main.java.com.georgescuconstantin.generictypes;

public class Fruits<T> {

    private T item;

    public Fruits(T item) {
        this.item = item;

    }

    public void setItem(T item) {
        this.item = item;

    }
}
