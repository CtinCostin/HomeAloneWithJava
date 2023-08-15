package main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {



        Product water = new GenericProduct(4.5, (date)->date.isAfter(LocalDate.now()));
        Product bread = new GenericProduct(3.75, (date)->true);

        Basket basket = new Basket();
        basket.addItem(water);
        basket.addItem(bread);

        List<Product> products = new ArrayList<>();
        products.add(water);
        products.add(bread);
        System.out.println("Produsele sunt :" + products);

        products.remove(bread);
        System.out.println(products);
        System.out.println(basket.getItemList());

        basket.removeItem(bread);
        System.out.println(basket.getItemList());


    }

}