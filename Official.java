
package model;

public class Official extends Employee{
    private int salaryMonth;

    public Official(String typeEmployee, String ID, String name, int age, String address, String email, int salaryMonth) {
        super(typeEmployee, ID, name, age, address, email);
        this.salaryMonth = salaryMonth;
    }

   

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    public int salary() {
        return salaryMonth;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Official{");
        sb.append("salaryMonth=").append(salaryMonth);
        sb.append('}');
        return sb.toString();
    }

}
