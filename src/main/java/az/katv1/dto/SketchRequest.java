package az.katv1.dto;

import az.katv1.entity.Employee;
import az.katv1.entity.Equipment;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Data
public class SketchRequest {
    private String address;
    private int saygac;
    private double coefficient;
    private Date date;
    private List<Employee> employeeList;
    private List<Equipment> equipmentList;
}
