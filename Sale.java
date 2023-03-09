
package model;

public class Sale extends Employee{
    private int salaryMonth;
    private int sales;
    private float commission;

    public Sale(String typeEmployee, String ID, String name, int age, String address, String email, int salaryMonth, int sales, float commission) {
        super(typeEmployee, ID, name, age, address, email);
        this.salaryMonth = salaryMonth;
        this.sales = sales;
        this.commission = commission;
    }

   

    public int getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(int salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    @Override
    public int salary() {
        return (int) (salaryMonth+sales*commission);
    }

    
    
}
