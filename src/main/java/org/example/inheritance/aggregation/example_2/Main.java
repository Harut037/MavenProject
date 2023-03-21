package org.example.inheritance.aggregation.example_2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Employee employee1 = new Employee("Karen", 27);
        Employee employee2 = new Employee("Armine", 35);
        bank.addEmployee(employee1);
        bank.addEmployee(employee2);
        bank.removeEmployee(employee1);
        bank.removeEmployee(employee2);

    }
}
