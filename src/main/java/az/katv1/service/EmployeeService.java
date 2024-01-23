package az.katv1.service;

import az.katv1.dto.EmployeeRequest;
import az.katv1.entity.Employee;
import az.katv1.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(EmployeeRequest employeeRequest) {
        Employee employee = new Employee();
        employee.setName(employeeRequest.getName());
        employee.setSurname(employeeRequest.getSurname());
        employeeRepository.save(employee);
    }
}
