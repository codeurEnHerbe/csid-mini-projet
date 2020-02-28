package Entreprise;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VacationService {

    VacationRepository vacationRepository;

    public VacationService(VacationRepository vacationRepository) {
        this.vacationRepository = vacationRepository;
    }

    public Vacation post(Vacation v) {
        VacationEntity savedVacation = vacationRepository.save(VacationMapper.vacationToEntity(v));
        return VacationMapper.entityToVacation(savedVacation);
    }

    public List<Vacation> get(int id) {
        return vacationRepository.findAll()
                .stream()
                .filter(vacation -> vacation.getEmployee().getId() == id)
                .map(v -> VacationMapper.entityToVacation(v)).collect(Collectors.toList());
    }
}
