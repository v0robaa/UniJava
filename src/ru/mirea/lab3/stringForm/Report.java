package ru.mirea.lab3.stringForm;

public class Report {
    public static int n = 20;
    public static Employee[] arr = new Employee[n];
    static public void generateReport() {
        for (int i = 0; i < n; i ++) {
            System.out.printf(arr[i].getFull_name() + " "+ "%10.2f\n", arr[i].getSalary());
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i < n; i ++) {
            String name = "Employee " + (i + 1) + ":";
            arr[i] = new Employee(name, i);
        }
        generateReport();
    }
}
