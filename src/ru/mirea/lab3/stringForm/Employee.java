package ru.mirea.lab3.stringForm;

public class Employee {
    private String full_name;
    private double salary;
    Employee(String full_name, double salary)
    {
        this.full_name = full_name;
        this.salary = salary;
    }
    public String getFull_name() {
        return full_name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "full_name='" + full_name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
