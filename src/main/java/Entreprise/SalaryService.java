package Entreprise;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class SalaryService {

    SalaryRepository salaryRepository;

    public SalaryService(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    public Salary post(Salary s, double salaryReference) {
        s.setAmount((s.getWorkDayNumber() * salaryReference) / 21);
        s.setPaymentDate(LocalDate.now());
        SalaryEntity savedSalary = salaryRepository.save(SalaryMapper.salaryToEntity(s));
        return SalaryMapper.entityToSalary(savedSalary);
    }
    public List<Salary> get(int id){
        return salaryRepository.findAll()
                .stream()
                .filter(salaryEntity -> salaryEntity.getEmployee().getId() == id )
                .map(salAri -> SalaryMapper.entityToSalary(salAri)).collect(Collectors.toList());
    }

    public List<SalaryDTO> getAll() {
        return salaryRepository.findAll().stream()
                .map(e -> SalaryMapper.salaryToDTO(SalaryMapper.entityToSalary(e)))
                .collect(Collectors.toList());
    }
}