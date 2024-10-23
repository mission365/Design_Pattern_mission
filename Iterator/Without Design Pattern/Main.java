/*
 * Let’s say we have a collection of employees in a company,
 * and we want to iterate over the employees to calculate their total salary.
 * However, the employees are stored in different types of collections (arrays, lists, etc.), 
 * and we want to iterate over them without exposing the underlying collection types.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Employee class with a salary
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + ": $" + salary;
    }
}

// Client code that calculates total salary without design pattern
public class Main {
    public static void main(String[] args) {
        // Array of employees
        Employee[] employeeArray = {
            new Employee("Alice", 50000),
            new Employee("Bob", 60000)
        };

        // List of employees
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Charlie", 55000));
        employeeList.add(new Employee("Dave", 70000));

        // Set of employees
        Set<Employee> employeeSet = new HashSet<>();
        employeeSet.add(new Employee("Eve", 62000));
        employeeSet.add(new Employee("Frank", 52000));

        // Calculate total salary (duplicate logic for different collections)
        double totalSalary = 0;

        // Handling array
        for (Employee employee : employeeArray) {
            totalSalary += employee.getSalary();
        }

        // Handling list
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }

        // Handling set
        for (Employee employee : employeeSet) {
            totalSalary += employee.getSalary();
        }

        System.out.println("Total Salary: $" + totalSalary);
    }
}
