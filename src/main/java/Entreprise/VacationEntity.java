package Entreprise;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Vacation")
public class VacationEntity {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;

    private Date dateDebut;
    private Date dateEnd;

    @ManyToOne
    private EmployeeEntity employee;

    public VacationEntity(){

    }

    public VacationEntity(int employeeId, Date dateDebut, Date dateEnd) {
        this.employee = new EmployeeEntity();
        employee.setId(employeeId);
        this.dateDebut = dateDebut;
        this.dateEnd = dateEnd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public EmployeeEntity getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeEntity employee) {
        this.employee = employee;
    }
}


