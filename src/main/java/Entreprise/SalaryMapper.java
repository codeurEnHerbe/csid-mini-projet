package Entreprise;

public class SalaryMapper {

    public static SalaryEntity salaryToEntity(Salary s){
        return new SalaryEntity(s.getEmployeeId(), s.getAmount(), s.getSalaryMonth(),s.getPaymentDate(), s.getWorkDayNumber());
    }

    public static Salary entityToSalary(SalaryEntity one) {
        Employee e = new Employee();
        e.setId(one.getEmployee().getId());
        return new Salary(e, one.getPaymentDate(),  one.getWorkDayNumber(), one.getSalaryMonth(), one.getAmount());
    }

    public static SalaryDTO salaryToDTO(Salary salary) {
        EmployeeDTO e = new EmployeeDTO();
        e.setId(salary.getEmployee().getId());
        return new SalaryDTO(e, salary.getAmount(), salary.getSalaryMonth(), salary.getPaymentDate(), salary.getWorkDayNumber());
    }

    public static Salary salaryDTOToSalary(SalaryDTO s) {
        return new Salary(s.getEmployeeId(), s.getPaymentDate(),  s.getWorkDayNumber(), s.getSalaryMonth());
    }
}
