package Entreprise;

import java.time.LocalDate;

public class Salary {

    private int employeeId;
    private double amount;
    private LocalDate paymentDate;
    private double workDayNumber;
    private String salaryMonth;
    private double salary;
    private Employee employee;

    public Salary(int employeeId, LocalDate paymentDate, double workDayNumber, String salaryMonth){
        this.employeeId = employeeId;
        this.amount = 0;
        this.paymentDate = paymentDate;
        this.workDayNumber = workDayNumber;
        this.salaryMonth = salaryMonth;
    }

    public Salary(Employee employee, LocalDate paymentDate, double workDayNumber, String salaryMonth, double amount){
        this.employee = employee;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.workDayNumber = workDayNumber;
        this.salaryMonth = salaryMonth;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public double getWorkDayNumber() {
        return workDayNumber;
    }

    public void setWorkDayNumber(double workDayNumber) {
        this.workDayNumber = workDayNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(String salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "employeeId=" + employeeId +
                ", amount=" + amount +
                ", paymentDate=" + paymentDate +
                ", workDayNumber=" + workDayNumber +
                '}';
    }
}
