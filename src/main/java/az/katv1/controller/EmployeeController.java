package az.katv1.controller;

import az.katv1.dto.EmployeeRequest;
import az.katv1.entity.Employee;
import az.katv1.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eskiz")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;

    }
    @GetMapping("/add")
    public String addEmployee(EmployeeRequest employee){
        employeeService.addEmployee(employee);
        return "add employee successfuly";
    }
}
