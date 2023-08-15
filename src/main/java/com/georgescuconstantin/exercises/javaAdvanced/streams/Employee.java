package main.java.com.georgescuconstantin.exercises.javaAdvanced.streams;

import main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10.Basket;
import main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10.GenericProduct;
import main.java.com.georgescuconstantin.exercises.javaAdvanced.streams.Ex10.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Employee {

    public static void main(String[] args) {

        Employee ion = new Employee(1790719100141L, "Ion Vasile", 25000);
        Employee coxtica = new Employee(1560213456789L, "Costi Georgescu", 31000);
        Employee rares = new Employee(null, "Rares Georgescu", 30700);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(ion);
        employeeList.add(coxtica);
        employeeList.add(rares);
        System.out.println("First list : " + employeeList);
        Employee employee = employeeList.stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getSalary() > 30000)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Employee not found!"));
        System.out.println("Sorted list : " + employee);

        System.out.println("-----------------------------");

//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(1L,"John" , 3200));
//        employees.add(new Employee(2L, "Mark", 1500));
//        employees.add(new Employee(3L, "Bill", 3600));

        List<Employee> employeesSorted = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted list by name: " +"\n" + employeesSorted);

        System.out.println("-----------------------");

        double maxSalary = employeeList.stream()
                .map(Employee::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);
        System.out.println("The maximum salary is: " + maxSalary);
    }

    private Long id;
    private String name;
    private double salary;

    public Employee(Long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
