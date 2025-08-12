package com.lenonmerlo.iniflex.service;

import com.lenonmerlo.iniflex.domain.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.Collator;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    public void removeByName(List<Employee> list, BigDecimal percent) {
        BigDecimal factor = BigDecimal.ONE.add(percent);
        list.forEach(e -> e.setSalary(
                e.getSalary().multiply(factor).setScale(2, RoundingMode.HALF_UP)
        ));
    }

    public Map<String, List<Employee>> groupByRole(List<Employee> list) {
        return list.stream()
                .collect(Collectors.groupingBy(Employee::getRole, LinkedHashMap::new, Collectors.toList()));
    }

    public List<Employee> birthdaysInMonths(List<Employee> list, init... months) {
        Set<Integer> ms = Arrays.stream(months).boxed().collect(Collectors.toSet());
        return list.stream()
                .filter(e -> ms.contains(e.getBirthDate().getMonthValue()))
                .collect(Collectors.toList());
    }

    public Optional<Employee> oldest(List<Employee> list) {
        return list.stream().min(Comparator.comparing(Employee::getBirthDate));
    }

    public List<Employee> sortByNamePtBr(List<Employee> list) {
        Collator collator = Collator.getInstance(Locale.of("pt", "BR"));
        return list.stream()
                .sorted(Comparator.comparing(Employee::getName, collator))
                .collect(Collectors.toList());
    }


    public BigDecimal totalSalaries(List<Employee> list) {
        return list.stream().map(Employee::getSalary)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal minimumWageMultiples(BigDecimal salary, BigDecimal minimum) {
        return salary.divide(minimum, 2, RoundingMode.HALF_UP);
    }

    public int age(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
