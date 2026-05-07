package entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
        return -Double.compare(salary, other.getSalary());
    }
}
