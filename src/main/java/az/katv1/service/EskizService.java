package az.katv1.service;

import az.katv1.dto.EskizRequest;
import az.katv1.entity.Eskiz;
import az.katv1.repository.EskizRepository;
import org.springframework.stereotype.Service;

@Service
public class EskizService {
    private final EskizRepository eskizRepository;

    public EskizService(EskizRepository eskizRepository) {
        this.eskizRepository = eskizRepository;
    }

    public void addEskiz(EskizRequest request) {
        Eskiz eskiz = new Eskiz();
        eskiz.setAddress(request.getAddress());
        eskiz.setSaygac(request.getSaygac());
        eskiz.setCoefficient(request.getCoefficient());
        eskiz.setDate(request.getDate());
        eskiz.setEmployees(request.getEmployeeList());
        eskiz.setEquipments(request.getEquipmentList());
        eskizRepository.save(eskiz);
    }
}
