package main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private final List<Product> itemList = new ArrayList<>();

      public void addItem(Product item) {
        itemList.add(item);
    }

    public void removeItem(Product item) {
        itemList.remove(item);
    }

    public List<Product> getItemList() {
        return new ArrayList<>(itemList);
    }

}
