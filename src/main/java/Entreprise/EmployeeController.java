package Entreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping("")
    public ResponseEntity putEmployee(@RequestBody() EmployeeDTO em){
        if(employeeService.put(EmployeeMapper.DTOToEmployee(em))) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }else {
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("")
    public List<EmployeeDTO> getEmployeeList(){
        return employeeService.getEmployees().stream().map(e->EmployeeMapper.EmployeeToDTO(e)).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity getEmployee(@PathVariable() int id){
        return getEmployeeList().stream()
                .filter(employee -> employee.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteEmployee(@PathVariable() int id){
        if(employeeService.delete(id)) {
            return ResponseEntity.ok().build();
        }else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity putEmployee(@PathVariable() int id, @RequestBody() EmployeeDTO em) throws URISyntaxException {
        boolean exist = employeeService.getEmployees().stream().filter(employee -> employee.getId() == id ).findFirst().isPresent();
        if(exist){
            Employee emp = employeeService.getEmployees().stream().filter(employee -> employee.getId() == id ).findFirst().get();
            employeeService.delete(emp.getId());
            employeeService.put(EmployeeMapper.DTOToEmployee(em));
            return ResponseEntity.created( new URI("/" + id) ).build();
        }

        return new ResponseEntity(HttpStatus.NOT_MODIFIED);
    }

    @PatchMapping("/{id}")
    public void patchEmployee(@PathVariable() int id, @RequestBody() EmployeeDTO em) {
        boolean exist =  employeeService.getEmployees().stream().filter(employee -> employee.getId() == id ).findFirst().isPresent();
        if(exist){
            Employee emp = employeeService.getEmployees().stream().filter(employee -> employee.getId() == id ).findFirst().get();
            if(em.getId()  >= 0)
                emp.setId(em.getId());

            if(em.getName() != null)
                emp.setName(em.getName());

            if(em.getAddress() != null)
                emp.setAddress(em.getAddress());

            employeeService.update(emp);
        }
    }
}