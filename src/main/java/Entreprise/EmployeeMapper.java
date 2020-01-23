package Entreprise;

public class EmployeeMapper {

    public static EmployeeDTO EmployeeToDTO(Employee e){
        return new EmployeeDTO(e.getId(),e.getName(),e.getAddress());
    }

    public static Employee DTOToEmployee(EmployeeDTO e){
        return new Employee(e.getId(),e.getName(),e.getAddress());
    }

    public static EmployeeEntity EmployeeToEntity(Employee e){
       return new EmployeeEntity(e.getId(), e.getName(), e.getAddress());
    }

    public static Employee EntityToEmployee(EmployeeEntity e){
        return new Employee(e.getId(), e.getName(), e.getAddress());
    }

}
