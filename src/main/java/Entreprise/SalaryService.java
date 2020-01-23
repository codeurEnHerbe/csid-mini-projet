package Entreprise;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SalaryService {

    SalaryRepository salaryRepository;

    public SalaryService(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }

    public void post(Salary s){
        salaryRepository.save(SalaryMapper.SalaryToEntity(s));
    }

}