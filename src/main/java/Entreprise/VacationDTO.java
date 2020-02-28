package Entreprise;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class VacationDTO {

    @JsonProperty()
    private int employeeId;

    @JsonProperty()
    private Date dateDebut;

    @JsonProperty()
    private Date dateEnd;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private EmployeeDTO employeeDTO;

    public VacationDTO() {

    }

    public VacationDTO(EmployeeDTO e, Date dateDebut, Date dateEnd) {
        this.employeeId = e.getId();
        this.employeeDTO = e;
        this.dateDebut = dateDebut;
        this.dateEnd = dateEnd;
    }

    public VacationDTO(int employeeId, Date dateDebut, Date dateEnd) {
        this.employeeId = employeeId;
        this.dateDebut = dateDebut;
        this.dateEnd = dateEnd;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
}
