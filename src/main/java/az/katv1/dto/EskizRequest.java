package az.katv1.dto;

import az.katv1.entity.Employee;
import az.katv1.entity.Equipment;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class EskizRequest {
    private String address;
    private int saygac;
    private int coefficient;
    private Date date;
    private List<Employee> employeeList;
    private List<Equipment> equipmentList;
}
