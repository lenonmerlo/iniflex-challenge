package com.lenonmerlo.iniflex.data;

import com.lenonmerlo.iniflex.domain.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class EmployeesData {
    private EmployeesData() {}

    public static List<Employee> seed() {

        List<Employee> list = new ArrayList<>();
        list.add(emp("Maria",   "2000-10-18", "2009.44", "Operador"));
        list.add(emp("João",    "1990-05-12", "2284.38", "Operador"));
        list.add(emp("Caio",    "1961-05-02", "9836.14", "Coordenador"));
        list.add(emp("Miguel",  "1988-10-14", "19119.88","Diretor"));
        list.add(emp("Alice",   "1995-01-05", "2234.68", "Recepcionista"));
        list.add(emp("Heitor",  "1999-11-19", "1582.72", "Operador"));
        list.add(emp("Arthur",  "1993-03-31", "4071.84", "Contador"));
        list.add(emp("Laura",   "1994-07-08", "3017.45", "Gerente"));
        list.add(emp("Heloísa", "2003-05-24", "1606.85", "Eletricista"));
        list.add(emp("Helena",  "1996-09-02", "2799.93", "Gerente"));
        return list;
    }

    private static Employee emp(String n, String isoDate, String sal, String role) {
        return new Employee(n, LocalDate.parse(isoDate), new BigDecimal(sal), role);
    }
}
