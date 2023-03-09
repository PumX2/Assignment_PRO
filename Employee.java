
package model;

public abstract class Employee {
    private String typeEmployee;
    private String ID;
    private String name;
    private int age;
    private String address;
    private String email;

    public Employee(String typeEmployee, String ID, String name, int age, String address, String email) {
        this.typeEmployee = typeEmployee;
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
    }

    public String getTypeEmployee() {
        return typeEmployee;
    }

    public void setTypeEmployee(String typeEmployee) {
        this.typeEmployee = typeEmployee;
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

    
    
    public abstract int salary();

    @Override
    public String toString() {
        return "Employee{" + "ID=" + ID + ", name=" + name + ", age=" + age + ", address=" + address + ", email=" + email + '}';
    }
    

}

