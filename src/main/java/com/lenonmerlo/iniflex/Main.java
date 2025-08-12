// src/main/java/com/lenonmerlo/iniflex/Main.java
package com.lenonmerlo.iniflex;

import com.lenonmerlo.iniflex.domain.Employee;
import com.lenonmerlo.iniflex.domain.Person;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Lenon", LocalDate.of(1990, 1, 1));
        Employee e = new Employee("Lenon", LocalDate.of(1990, 1, 1), new BigDecimal("5000.00"), "Developer");

        System.out.println(p);
        System.out.println(e);
    }
}
