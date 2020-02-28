package Entreprise;

public class VacationMapper {

    public static VacationDTO vacationToDTO(Vacation v) {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(v.getEmployee().getId());
        return new VacationDTO(e, v.getDateDebut(), v.getDateEnd());
    }


    public static VacationEntity vacationToEntity(Vacation v) {
        return new VacationEntity(v.getEmployeeId(), v.getDateDebut(), v.getDateEnd());

    }

    public static Vacation entityToVacation(VacationEntity savedVacation) {
        Employee e = new Employee();
        e.setId(savedVacation.getEmployee().getId());
        return new Vacation(e, savedVacation.getDateDebut(), savedVacation.getDateEnd());
    }

    public static Vacation vacationDTOToVacation(VacationDTO v) {
        return new Vacation(v.getEmployeeId(), v.getDateDebut(), v.getDateEnd());
    }
}
