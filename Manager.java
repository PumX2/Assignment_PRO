
package controller;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Manager {
    private ArrayList<Employee> employees = new ArrayList<>();
    public void findSalaryRange(double minSalaryMonth, double maxSalaryMonth) {
    for (Employee employee : employees) {
        if (employee.getSalaryMonth() >=  && employee.getSalaryMonth() <= maxSalaryMonth) {
            System.out.println(employee.getName() + " - " + employee.getSalaryMonth());
        }
    }
}
    public void sortEmployees() {
    Collections.sort(employees, new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            int lastNameCompare = o1.getName().split(" ")[1].compareTo(o2.getName().split(" ")[1]);
            if (lastNameCompare == 0) {
                return Double.compare(o1.getSalaryMonth(), o2.getSalaryMonth());
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
            return Double.compare(o2.getSalaryMonth(), o1.getSalaryMonth());
        }
    });
    System.out.println("The top 3 highest paid retired employees are:");
    for (int i = 0; i < Math.min(3, retiredEmployees.size()); i++) {
        Employee employee = retiredEmployees.get(i);
        System.out.println(employee.getName() + " - " + employee.getSalaryMonth());
    }
}

}
