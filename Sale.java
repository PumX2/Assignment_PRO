
package model;

public class Sale extends Employee{
    private int salaryMonth;
    private int sales;
    private float commission;

    public Sale(int salaryMonth, int sales, float commission, String ID, String name, int age, String address, String email, int tax) {
        super(ID, name, age, address, email, tax);
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sale{");
        sb.append("salaryMonth=").append(salaryMonth);
        sb.append(", sales=").append(sales);
        sb.append(", commission=").append(commission);
        sb.append('}');
        return sb.toString();
    }
    
}
