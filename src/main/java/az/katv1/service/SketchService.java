package az.katv1.service;

import az.katv1.dto.request.SketchRequest;
import az.katv1.entity.Sketch;
import az.katv1.dao.repository.SketchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
        sketch.setEmployeeList(request.getEmployeeList());
        sketch.setEquipmentList(request.getEquipmentList());
        sketchRepository.save(sketch);
    }

    public Sketch getSketchById(Integer id) {
        return sketchRepository.findById(id).orElse(null);
    }

    public List<Sketch> getAllSketch() {
        return sketchRepository.findAll();
    }
}
