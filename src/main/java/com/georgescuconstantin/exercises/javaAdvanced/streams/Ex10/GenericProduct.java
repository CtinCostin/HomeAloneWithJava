package main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10;

import java.time.LocalDate;
import java.util.function.Function;

public class GenericProduct implements Product{

    private final Double price;

    private final Function<LocalDate, Boolean> availabilityFunction;

    public GenericProduct(final Double price, final Function<LocalDate, Boolean> availabilityFunction) {
        this.price = price;
        this.availabilityFunction = availabilityFunction;
    }


    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public Boolean checkAvailability(LocalDate localDate) {
        return availabilityFunction.apply(localDate);
    }

    @Override
    public String toString() {
        return "GenericProduct{" +
                "price=" + price +
                ", availabilityFunction=" + availabilityFunction +
                '}';
    }
}
