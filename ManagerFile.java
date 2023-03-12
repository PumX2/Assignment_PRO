
package controller;
import Controller.FormatException;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import model.Employee;
import model.Leader;
import model.Official;
import model.Sale;

public class ManagerFile extends ArrayList<Employee>{
    public static ArrayList<Employee> empList= new ArrayList<>();//emplist laf arraylist luu tru toan bo nhan vien

    public Manager() {
        super();
    }

    public void InputData() throws IOException, ParseException,FormatException {
        String txtFile = ("F:\\pro\\Employee.txt\\");
        File flie = new File(txtFile);
        try( BufferedReader br = new BufferedReader(new FileReader(flie));){
                String line = "";
           while((line = br.readLine()) != null){
               String arg[] = line.split(";");
               if(arg[0]=="" || arg[1]=="")throw new FormatException("Role and ID must not be empty");
               String ntypeEmployee = arg[0];
               String nID = arg[1];
               String nname = arg[2];
               int nage = Integer.parseInt(arg[3]) ;
               String naddress = arg[4];
               String nemail= arg[5];
               int nsalarymonth = Integer.parseInt(arg[6]);
               int resOrSales = Integer.parseInt(arg[7]); //salaryResponsibility of Leader OR sales of Sale
               float ncommission = Float.parseFloat(arg[8]);
               switch(ntypeEmployee){
                   case "Leader":
                       Employee lemp = new Leader(ntypeEmployee, nID, nname, nage, naddress, nemail, nsalarymonth, resOrSales);
                       empList.add(lemp);
                       lemp.salary();
                       break;
                   case "Official":
                       Employee oemp = new Official(ntypeEmployee, nID, nname, nage, naddress, nemail, nsalarymonth);
                       empList.add(oemp);
                       oemp.salary();
                       break;
                   case "Sale":
                       Employee semp = new Sale(ntypeEmployee, nID, nname, nage, naddress, nemail, nsalarymonth, resOrSales, ncommission);
                       empList.add(semp);
                       semp.salary();
                       break;
                   default:break;
               }
            }
        }catch(FileNotFoundException e){
                    e.printStackTrace();
                    }
        
        
    }
    public void Display() {
            for(Employee empl : empList){
                System.out.println(empl);
            }
        }
    public Employee search (String id) {
				id=id.trim().toUpperCase();
				for (int i=0; i<empList.size();i++)
					if (empList.get(i).getID().equals(id)) return empList.get(i);
				return null;
			}
    public void Remove(){
        Scanner sc = new Scanner(System.in);
        String id="";
        System.out.println("Enter the employee id you want to delete");
        id=sc.nextLine();
        Employee emp = search(id);
        System.out.println(emp);
        System.out.println("Remove this employee ?(Y/N) ");
        String choice = sc.next();
        switch(choice.toUpperCase()){
            case "Y":
                empList.remove(emp);
                System.out.println("Done !");
                break;
            case "N":
                System.out.println("Ok");
                break;
            default:
                System.out.println("Ok");
                break;
            
        }
    }
    
    
    
}
