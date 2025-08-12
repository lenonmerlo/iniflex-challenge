# Iniflex Challenge – Employee Management

## 📋 Descrição (Português)
Este projeto foi desenvolvido como solução para o teste prático de programação da Iniflex.

O sistema gerencia uma lista de funcionários, realizando operações como:
1. Inserir todos os funcionários na ordem e dados fornecidos.
2. Remover um funcionário pelo nome.
3. Imprimir dados com formatação brasileira:
   - Data: `dd/MM/yyyy`
   - Valores numéricos: `1.234,56`
4. Aplicar aumento de 10% no salário.
5. Agrupar funcionários por função.
6. Imprimir funcionários agrupados.
7. Listar aniversariantes nos meses de Outubro (10) e Dezembro (12).
8. Exibir o funcionário mais velho com nome e idade.
9. Ordenar funcionários alfabeticamente (ordem PT-BR).
10. Calcular e exibir o total dos salários.
11. Calcular quantos salários mínimos cada funcionário recebe (base: R$ 1212,00).

### Como rodar
Pré-requisitos:
- Java 21+
- Maven 3.9+

Passos:
```bash
# Clonar repositório
git clone <url-do-repositorio>

# Entrar na pasta do projeto
cd iniflex-challenge

# Compilar
mvn clean install

# Executar
mvn exec:java -Dexec.mainClass="com.lenonmerlo.iniflex.Main"
```

### Saída de exemplo
```
== Todos os funcionários ==
Maria | 18/10/2000 | 2.009,44 | Operador
Caio | 02/05/1961 | 9.836,14 | Coordenador
...
== Total dos salários ==
50.906,82
```

---

## 📋 Description (English)
This project was developed as the solution for the Iniflex programming challenge.

The system manages a list of employees, performing the following tasks:
1. Insert all employees in the given order with provided data.
2. Remove an employee by name.
3. Print data with Brazilian formatting:
   - Date: `dd/MM/yyyy`
   - Numeric values: `1.234,56`
4. Apply a 10% salary increase.
5. Group employees by role.
6. Print grouped employees.
7. List employees with birthdays in October (10) and December (12).
8. Show the oldest employee with name and age.
9. Sort employees alphabetically (PT-BR order).
10. Calculate and print the total of all salaries.
11. Calculate how many minimum wages each employee earns (base: R$ 1212,00).

### How to run
Requirements:
- Java 21+
- Maven 3.9+

Steps:
```bash
# Clone repository
git clone <repository-url>

# Go to project folder
cd iniflex-challenge

# Build
mvn clean install

# Run
mvn exec:java -Dexec.mainClass="com.lenonmerlo.iniflex.Main"
```

### Example output
```
== All employees ==
Maria | 18/10/2000 | 2.009,44 | Operador
Caio | 02/05/1961 | 9.836,14 | Coordenador
...
== Total salaries ==
50.906,82
```
