package main.java.com.georgescuconstantin.designpatterns.solid.singleresponsability;

public class MainSRP {

    public static void main(String[] args) {

        HRPromotions hrPromotions = new HRPromotions();
        TaxCalculations taxCalculations = new TaxCalculations();

        Employee employee = new Employee();
        hrPromotions.isPromotionDueThisYear(employee);
        taxCalculations.calculateTaxForCurrentYear(employee);

    }
}
