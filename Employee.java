
package model;

public abstract class Employee {
    private String ID;
    private String name;
    private int age;
    private String address;
    private String email;
    private int tax;

    public Employee(String ID, String name, int age, String address, String email, int tax) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.tax = tax;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        if (salary()<9000000) {
           this.tax=0;
        }
        else if (9000000<=salary() && salary()<=15000000) {
            this.tax=salary()*10/100;
        }
        else if (salary()>15000000) {
            this.tax=salary()*12/100;
        }
    }
    
    public abstract int salary();

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", age=" + age + ", address=" + address + ", email=" + email + ", tax=" + tax + '}';
    }
    

}
