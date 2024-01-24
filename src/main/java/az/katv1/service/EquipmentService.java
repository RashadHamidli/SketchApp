package az.katv1.service;

import az.katv1.dto.request.EquipmentRequest;
import az.katv1.entity.Equipment;
import az.katv1.dao.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    private final EquipmentRepository equipmentRepository;

    public EquipmentService(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    public void addEquipment(EquipmentRequest equipmentRequest) {
        Equipment equipment = new Equipment();
        equipment.setName(equipmentRequest.getName());
        equipmentRepository.save(equipment);

    }

    public List<Equipment> getAllEquipmenst() {
        return equipmentRepository.findAll();
    }
}
