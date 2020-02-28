package Entreprise;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="Salary")
public class SalaryEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;
    private String salaryMonth;
    private LocalDate paymentDate;
    private double workDayNumber;

    @ManyToOne
    private EmployeeEntity employee;

    public SalaryEntity(){}

    public SalaryEntity(int employeeId, double amount, String salaryMonth ,LocalDate paymentDate, double workDayNumber) {
        this.employee = new EmployeeEntity();
        employee.setId(employeeId);
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.workDayNumber = workDayNumber;
        this.salaryMonth = salaryMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }

}