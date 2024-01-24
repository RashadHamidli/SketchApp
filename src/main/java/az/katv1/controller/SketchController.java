package az.katv1.controller;

import az.katv1.dto.request.SketchRequest;
import az.katv1.dao.entity.Employee;
import az.katv1.dao.entity.Equipment;
import az.katv1.service.EmployeeService;
import az.katv1.service.EquipmentService;
import az.katv1.service.SketchService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/sketch")
public class SketchController {
    private final SketchService sketchService;
    private final EmployeeService employeeService;
    private final EquipmentService equipmentService;

    public SketchController(SketchService sketchService, EmployeeService employeeService, EquipmentService equipmentService) {
        this.sketchService = sketchService;
        this.employeeService = employeeService;
        this.equipmentService = equipmentService;
    }

    @GetMapping("/add")
    public String showAddEskizForm(Model model) {
        List<Employee> allEmployees = employeeService.getAllEmployees();
        List<Equipment> allEquipments=equipmentService.getAllEquipmenst();
        model.addAttribute("allEquipments", allEquipments);
        model.addAttribute("allEmployees", allEmployees);
        model.addAttribute("sketchRequest", new SketchRequest());
        return "add-sketch";
    }

    @PostMapping("/add")
    public String addSketch(@ModelAttribute SketchRequest sketchRequest) {
        sketchService.addEskiz(sketchRequest);
        return "redirect:/sketch/add?success=true";
    }
}
