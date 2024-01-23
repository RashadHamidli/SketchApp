package az.katv1.service;

import az.katv1.dto.SketchRequest;
import az.katv1.entity.Sketch;
import az.katv1.repository.SketchRepository;
import org.springframework.stereotype.Service;

@Service
public class SketchService {
    private final SketchRepository sketchRepository;

    public SketchService(SketchRepository sketchRepository) {
        this.sketchRepository = sketchRepository;
    }

    public void addEskiz(SketchRequest request) {
        Sketch sketch = new Sketch();
        sketch.setAddress(request.getAddress());
        sketch.setSaygac(request.getSaygac());
        sketch.setCoefficient(request.getCoefficient());
        sketch.setDate(request.getDate());
        sketch.setEmployees(request.getEmployeeList());
        sketch.setEquipments(request.getEquipmentList());
        sketchRepository.save(sketch);
    }
}
