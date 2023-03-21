package org.example.inheritance.aggregation.example_2;

import java.util.List;

public class Bank {
    private List<Employee> employees;

    public Bank() {
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}
