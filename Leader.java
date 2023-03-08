
package model;

public class Leader extends Employee{
    private int salaryMonth;
    private int salaryResponsibility;

    public Leader(int salaryMonth, int salaryResponsibility, String ID, String name, int age, String address, String email, int tax) {
        super(ID, name, age, address, email, tax);
        this.salaryMonth = salaryMonth;
        this.salaryResponsibility = salaryResponsibility;
    }

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public int getSalaryResponsibility() {
        return salaryResponsibility;
    }

    public void setSalaryResponsibility(int salaryResponsibility) {
        this.salaryResponsibility = salaryResponsibility;
    }

    @Override
    public int salary() {
        return salaryMonth + salaryResponsibility;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Leader{");
        sb.append("salaryMonth=").append(salaryMonth);
        sb.append(", salaryResponsibility=").append(salaryResponsibility);
        sb.append('}');
        return sb.toString();
    }
    
}
