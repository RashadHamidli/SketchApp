package az.katv1.controller;

import az.katv1.dto.EmployeeRequest;
import az.katv1.entity.Employee;
import az.katv1.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
    @GetMapping("/add")
    public String showAddEmployeeForm(Model model) {
        model.addAttribute("employee", new EmployeeRequest());
        return "add-employee";
    }

    @PostMapping("/add")
    public String addEmployee(EmployeeRequest employee) {
        employeeService.addEmployee(employee);
        return "redirect:/employee/add?success=true";
    }
}
