package Entreprise;

public class EmployeeMapper {

    public static EmployeeDTO EmployeeToDTO(Employee e){
        return new EmployeeDTO(e.getId(),e.getName(), e.getAddress().getNumber(), e.getAddress().getStreetName(),
                e.getAddress().getZipCode(), e.getAddress().getCity(), e.getAddress().getCountry(), e.getSalary());
    }

    public static Employee DTOToEmployee(EmployeeDTO e){
        return new Employee(e.getId(),e.getName(),new Adress(e.getStreetNumber(), e.getStreetName(), e.getPostalCode(), e.getCity(), e.getCountry()), e.getSalary());
    }

    public static EmployeeEntity EmployeeToEntity(Employee e){
        Adress adress = e.getAddress();
       return new EmployeeEntity(e.getId(), e.getName(), adress.getNumber(), adress.getStreetName(), adress.getZipCode(), adress.getCity(), adress.getCountry(), e.getSalary());
    }

    public static Employee EntityToEmployee(EmployeeEntity e){
        return new Employee(e.getId(), e.getName(), new Adress(e.getStreetNumber(), e.getStreetName(), e.getZipCode(), e.getCity(), e.getCountry()), e.getSalary());
    }

}
