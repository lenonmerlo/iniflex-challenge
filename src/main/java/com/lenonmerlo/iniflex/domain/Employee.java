// src/main/java/com/lenonmerlo/iniflex/domain/Employee.java
package com.lenonmerlo.iniflex.domain;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee extends Person {
    private BigDecimal salary;
    private final String role; //

    public Employee(String name, LocalDate birthDate, BigDecimal salary, String role) {
        super(name, birthDate);
        this.salary = salary;
        this.role = role;
    }
    public BigDecimal getSalary() { return salary; }
    public void setSalary(BigDecimal salary) { this.salary = salary; }
    public String getRole() { return role; }

    @Override
    public String toString() {
        return "Employee{name='" + getName() + "', birthDate=" + getBirthDate() +
                ", salary=" + salary + ", role='" + role + "'}";
    }
}
