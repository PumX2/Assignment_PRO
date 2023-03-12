package controller;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import model.*;

public class Validation {

    private final static Scanner in = new Scanner(System.in);

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static boolean checkInputYN() {
        while (true) {
            String result = checkInputString();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N.");
            System.out.print("Enter again: ");
        }
    }
    public static int checkInputInt(){
        while(true){
            try{
                int result = Integer.parseInt(in.nextLine());
                if(result<=0){
                    throw new NumberFormatException();
                }
                return result;
            }
            catch(NumberFormatException e){
                System.err.println("Input must be digit.");
            }
        }
    }

    public static String checkInputEmail() {
        while (true) {
            String result = checkInputString();
            if (result.matches("^[A-Za-z0-9.+-_%]+@[A-Za-z.-]+\\.[A-Za-z]{2,4}$")) {
                return result;
            } else {
                System.err.println("Email with format <account name>@<domain>");
                System.out.print("Enter again: ");
            }
        }
    }


    public static boolean checkIdExist(ArrayList<Employee> employees, String id) {
        for (Employee candidate : employees) {
            if (candidate.getID().equalsIgnoreCase(id)) {
                System.err.println("Id exist.");
                return false;
            }
        }
        return true;
    }

}
