package main.java.com.georgescuconstantin.exercises.fundamentals;

import java.util.Arrays;

public class Company {

    private String companyName;
    private Employee[] employees = new Employee[5];


    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public float getAverageAge() {
        float sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getAge();
        }
        return sum / employees.length;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + "\'" +
                ", employees=" + "\n" + Arrays.toString(employees) +
                '}';
    }
}
