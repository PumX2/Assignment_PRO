
package controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Manager {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void findSalaryRange(double minSalary, double maxSalary) {
    for (Employee employee : employees) {
        if (employee.getSalary() >= minSalary && employee.getSalary() <= maxSalary) {
            System.out.println(employee.getFullName() + " - " + employee.getSalary());
        }
    }
}
    public void sortEmployees() {
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int lastNameCompare = o1.getFullName().split(" ")[1].compareTo(o2.getFullName().split(" ")[1]);
            if (lastNameCompare == 0) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
            return lastNameCompare;
        }
    });
    System.out.println("Employees have been sorted.");
}
    public void displayRetiredEmployees() {
    List<Employee> retiredEmployees = new ArrayList<>();
    for (Employee employee : employees) {
        if (employee.getAge() >= 65) {
            retiredEmployees.add(employee);
        }
    }
    Collections.sort(retiredEmployees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return Double.compare(o2.getSalary(), o1.getSalary());
        }
    });
    System.out.println("The top 3 highest paid retired employees are:");
    for (int i = 0; i < Math.min(3, retiredEmployees.size()); i++) {
        Employee employee = retiredEmployees.get(i);
        System.out.println(employee.getFullName() + " - " + employee.getSalary());
    }
}

}
