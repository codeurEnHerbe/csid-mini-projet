package Entreprise;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class Vacation {

    private Employee employee;
    private Date dateDebut;
    private Date dateEnd;
    private int employeeId;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Autowired
    public Vacation(Employee e, Date dateDebut, Date dateEnd) {
        this.employee = e;
        this.dateDebut = dateDebut;
        this.dateEnd = dateEnd;
    }

    public Vacation(int employeeId, Date dateDebut, Date dateEnd) {
        this.employeeId = employeeId;
        this.dateDebut = dateDebut;
        this.dateEnd = dateEnd;
    }

    public Employee getEmployee() {
        return employee;
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

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Vacation{" +
                "employee=" + employee +
                ", dateDebut=" + dateDebut +
                ", dateEnd=" + dateEnd +
                '}';
    }
}
