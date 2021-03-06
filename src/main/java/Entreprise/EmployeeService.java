package Entreprise;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    EmployeeRepository empRep;

    public EmployeeService(EmployeeRepository empRep){
        this.empRep = empRep;
    }

    public List<Employee> getEmployees(){
        return empRep.findAll().stream()
                .map(e -> EmployeeMapper.EntityToEmployee(e))
                .collect(Collectors.toList());
    }

    public boolean put(Employee e){
        if(empRep.findAll().stream().filter(employee -> employee.getId() == e.getId()).findFirst().isPresent()){
            return true;
        }else{
            empRep.save(EmployeeMapper.EmployeeToEntity(e));
            System.out.println(e);
            return false;
        }
    }

    public void update(Employee e){
        Employee emp = EmployeeMapper.EntityToEmployee(empRep.findAll().stream().filter(employee -> employee.getId() == e.getId() ).findFirst().get());

        if(e.getId() >= 0)
            emp.setId(e.getId());

        if(e.getName() != null)
            emp.setName(e.getName());

        if(e.getAddress() != null)
            emp.setAddress(e.getAddress());
    }

    public boolean delete(int id){

        if(getEmployees().stream().filter(employee -> employee.getId() == id ).findFirst().isPresent()){
            empRep.deleteById(id);
            return true;
        }

        return false;
    }

    public Employee getOne(int id){
        return  EmployeeMapper.EntityToEmployee(empRep.getOne(id));
    }
}
