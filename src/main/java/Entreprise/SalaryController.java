package Entreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/salaries")
public class SalaryController {

    private final SalaryService salaryService;
    private final EmployeeService employeeService;

    @Autowired
    public SalaryController(SalaryService salaryService, EmployeeService employeeService){ this.salaryService = salaryService;
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public List<SalaryDTO> getSalary(@PathVariable() int id){
        return salaryService.get(id).stream()
                .map( e -> SalaryMapper.salaryToDTO(e))
                .collect(Collectors.toList());
    }

    @PostMapping("")
    public SalaryDTO postSalary(@RequestBody() SalaryDTO s){
        Employee e = employeeService.getOne(s.getEmployeeId());

        return SalaryMapper.salaryToDTO(salaryService.post(SalaryMapper.salaryDTOToSalary(s), e.getSalary()));

    }

    @GetMapping("")
    public List<SalaryDTO> getAllSalaries()
    {
        return salaryService.getAll();
    }

}
