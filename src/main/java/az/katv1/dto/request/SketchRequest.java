package az.katv1.dto.request;

import az.katv1.entity.Employee;
import az.katv1.entity.Equipment;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class SketchRequest {
    private String address;
    private int saygac;
    private double coefficient;
    private LocalDateTime date;
    private List<Employee> employeeList;
    private List<Equipment> equipmentList;
}