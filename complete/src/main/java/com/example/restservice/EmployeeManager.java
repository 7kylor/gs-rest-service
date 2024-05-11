package com.example.restservice;

public class EmployeeManager {

    private Employees employees = new Employees();

    public EmployeeManager() {
        // Add 3-4 example employees
        Employee employee1 = new Employee();
        employee1.setEmployeeId("1");
        employee1.setFirstName("test");
        employee1.setLastName("test");
        employee1.setEmail("test@test.com")
        employee1.setTitle("test");
    }

    public Employees getEmployees() { return employees; }
}