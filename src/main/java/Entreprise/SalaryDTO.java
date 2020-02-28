package Entreprise;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class SalaryDTO {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int employeeId;

    private double amount;

    private String salaryMonth;

    private LocalDate paymentDate;

    private double workDayNumber;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private EmployeeDTO employee;

    public SalaryDTO(){

    }

    public SalaryDTO(EmployeeDTO employee, double amount, String salaryMonth, LocalDate paymentDate, double workDayNumber){
        this.employee = employee;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.salaryMonth = salaryMonth;
        this.workDayNumber = workDayNumber;
    }

    public SalaryDTO(int employeeId, String salaryMonth, LocalDate paymentDate, double workDayNumber){
        this.employeeId = employeeId;
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

    public String getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(String salaryMonth) {
        this.salaryMonth = salaryMonth;
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

    public EmployeeDTO getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeDTO employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "SalaryDTO{" +
                "employeeId=" + employeeId +
                ", amount=" + amount +
                ", salaryMonth='" + salaryMonth + '\'' +
                ", paymentDate=" + paymentDate +
                ", workDayNumber=" + workDayNumber +
                '}';
    }
}
