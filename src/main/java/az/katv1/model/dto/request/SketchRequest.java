package az.katv1.model.dto.request;

import az.katv1.model.dao.entity.Employee;
import az.katv1.model.dao.entity.Equipment;
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