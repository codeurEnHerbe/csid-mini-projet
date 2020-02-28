package Entreprise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/vacation")
public class VacationControler {

    private final VacationService vacationService;
    private final EmployeeService employeeService;

    @Autowired
    public VacationControler(VacationService vacationService, EmployeeService employeeService) {
        this.vacationService = vacationService;
        this.employeeService = employeeService;
    }

    @PostMapping("")
    public VacationDTO postVacation(@RequestBody() VacationDTO v) {

        return VacationMapper.vacationToDTO(vacationService.post(VacationMapper.vacationDTOToVacation(v)));
    }

    @GetMapping("/{id}")
    public List<VacationDTO> getVacation(@PathVariable() int id) {
        return vacationService.get(id).stream()
                .map( v -> VacationMapper.vacationToDTO(v))
                .collect(Collectors.toList());
    }
}
