package main.java.com.georgescuconstantin.exercises.fundamentals;

public class MainCompany {

    public static void main(String[] args) {

        Employee ion = new Employee("Ion", "Frone", 42);
        Employee vasile = new Employee("Vasile", "Dinu", 49);
        Employee gigel = new Employee("Gigel", "Ion", 56);
        Employee costica = new Employee("Costica", "Turcu", 39);
        Employee maria = new Employee("Maria", "Cucu", 37);
        Company company = new Company("Mercedes");
        company.setEmployees(new Employee[]{ion, vasile, gigel, costica, maria});
        System.out.println("Company data: " + "\n" + company);
        System.out.println("Average employee age:" + company.getAverageAge());


    }
}
