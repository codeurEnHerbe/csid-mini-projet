package Entreprise;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Salary")
public class SalaryEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    private Employee employee;
    private long amount;
    private Date cotisationPeriod;
    private Date paymentDate;
    private int dayAmount;

    public SalaryEntity(Employee employee, long amount, Date cotisationPeriod, Date paymentDate, int dayAmount) {
        this.employee = employee;
        this.amount = amount;
        this.cotisationPeriod = cotisationPeriod;
        this.paymentDate = paymentDate;
        this.dayAmount = dayAmount;
    }


}
