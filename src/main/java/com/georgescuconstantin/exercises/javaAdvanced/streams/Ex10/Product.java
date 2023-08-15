package main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10;

import java.time.LocalDate;

public interface Product {

    Double getPrice();

    Boolean checkAvailability(LocalDate localDate);
}
