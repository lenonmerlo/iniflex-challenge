package com.lenonmerlo.iniflex;

import com.lenonmerlo.iniflex.data.EmployeesData;
import com.lenonmerlo.iniflex.domain.Employee;
import com.lenonmerlo.iniflex.service.EmployeeService;
import com.lenonmerlo.iniflex.util.FormatUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        EmployeeService svc = new EmployeeService();

        // 3.1 – inserir
        List<Employee> employees = EmployeesData.seed();

        // 3.2 – remover João
        svc.removeByName(employees, "João");

        // 3.3 – imprimir todos (data dd/MM/aaaa e número 1.234,56)
        title("Todos os funcionários");
        employees.forEach(Main::printEmployee);

        // 3.4 – +10%
        svc.applyRaise(employees, new BigDecimal("0.10"));
        title("Após aumento de 10%");
        employees.forEach(Main::printEmployee);

        // 3.5 – agrupar por função
        Map<String, List<Employee>> byRole = svc.groupByRole(employees);

        // 3.6 – imprimir agrupados
        title("Agrupados por função");
        byRole.forEach((role, list) -> {
            System.out.println("[" + role + "]");
            list.forEach(Main::printEmployee);
            System.out.println();
        });

        // 3.8 – aniversariantes mês 10 e 12
        title("Aniversariantes (Outubro e Dezembro)");
        svc.birthdaysInMonths(employees, 10, 12).forEach(Main::printEmployee);

        // 3.9 – mais velho (nome e idade)
        svc.oldest(employees).ifPresent(old -> {
            int idade = svc.age(old.getBirthDate());
            title("Funcionário mais velho");
            System.out.println(old.getName() + " - " + idade + " anos");
        });

        // 3.10 – ordem alfabética
        title("Ordem alfabética");
        svc.sortByNamePtBr(employees).forEach(Main::printEmployee);

        // 3.11 – total dos salários
        title("Total dos salários");
        System.out.println(FormatUtils.BR_NUM.format(svc.totalSalaries(employees)));

        // 3.12 – múltiplos do salário mínimo (1212.00)
        title("Quantos salários mínimos (R$1212,00) cada um ganha");
        BigDecimal minimum = new BigDecimal("1212.00");
        employees.forEach(e -> {
            var mult = svc.minimumWageMultiples(e.getSalary(), minimum);
            System.out.println(e.getName() + ": " + FormatUtils.BR_NUM.format(mult));
        });
    }

    private static void printEmployee(Employee e) {
        String date = e.getBirthDate().format(FormatUtils.BR_DATE);
        String sal  = FormatUtils.BR_NUM.format(e.getSalary());
        System.out.printf("%s | %s | %s | %s%n", e.getName(), date, sal, e.getRole());
    }

    private static void title(String t) {
        System.out.println("\n== " + t + " ==");
    }
}
