package az.katv1.controller;

import az.katv1.dto.EmployeeRequest;
import az.katv1.dto.EquipmentRequest;
import az.katv1.service.EmployeeService;
import az.katv1.service.EquipmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("equipment")
public class EquipmentController {
    private final EquipmentService equipmentService;

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }


    @GetMapping("/add")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("equipment", new EquipmentRequest());
        return "add-equipment";
    }

    @PostMapping("/add")
    public String addEmployee(EquipmentRequest equipmentRequest) {
        equipmentService.addEquipment(equipmentRequest);
        return "redirect:/equipment/add?success=true";
    }
}
