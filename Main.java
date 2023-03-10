package view;

import controller.*;
import controller.Validation;
import java.util.ArrayList;
import model.*;
import java.io.FileNotFoundException;
import java.text.ParseException;

public class Main extends Menu {
    Scanner scanner = new Scanner(System.in);
    Manager manager = new Manager();
    static String[] mc = {"Export list", "Delete employee", "Update information", "Find employees by salary range", "Sort by name and salary",
        "Add new staff", "Output the 3 highest-earning retirement age employees", "Exit."};
    ArrayList<Employee> employees = new ArrayList<>();
    
    
    
    
    public Main() throws FileNotFoundException, ParseException {
        super("COMPANY MANAGEMENT SYSTEM", mc);
        //CardManager.readFile("C:\\HUNG\\DEV\\JAVA\\LAB211_Lab6_CardManage\\src\\model\\transaction.txt", transactions);
    }
//--------------------------------------------------------

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.print("Enter minimum salary: ");
                double minSalary = Validation.checkInputInt();
                System.out.print("Enter maximum salary: ");
                double maxSalary = Validation.checkInputInt();
                Validation.checkInputIntSalary(minSalary, maxSalary);
                manager.findSalaryRange(minSalary, maxSalary);
                break;
            case 5:
                manager.sortEmployees();
                break;
            case 6:
                break;
            case 7:
                manager.displayRetiredEmployees();
                break;
            case 8:
                System.out.println("Thank You...");
                System.exit(0);
        }
        
    }
//-------------------------------------------------------

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        new Main().run();
    }
}
