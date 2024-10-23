import java.util.ArrayList;
import java.util.List;
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
// Aggregate interface: defines how to create an iterator
interface Aggregate {
    Iterator createIterator();
}

// Concrete Aggregate: Collection of employees
class EmployeeCollection implements Aggregate {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public Iterator createIterator() {
        return new EmployeeIterator(employees);
    }
}
// Iterator interface: defines iteration methods
interface Iterator {
    boolean hasNext();
    Employee next();
}
// Concrete Iterator: Implements the Iterator interface for EmployeeCollection
class EmployeeIterator implements Iterator {
    private List<Employee> employees;
    private int position = 0;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return position < employees.size();
    }

    @Override
    public Employee next() {
        if (!hasNext()) {
            return null;
        }
        return employees.get(position++);
    }
}
public class Main {
    public static void main(String[] args) {
        // Create the employee collection (Concrete Aggregate)
        EmployeeCollection employeeCollection = new EmployeeCollection();
        employeeCollection.addEmployee(new Employee("Alice", 50000));
        employeeCollection.addEmployee(new Employee("Bob", 60000));
        employeeCollection.addEmployee(new Employee("Charlie", 55000));

        // Create the iterator for the employee collection
        Iterator iterator = employeeCollection.createIterator();

        // Iterate over the collection using the iterator
        double totalSalary = 0;
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            totalSalary += employee.getSalary();
            System.out.println(employee);
        }

        System.out.println("Total Salary: $" + totalSalary);
    }
}
