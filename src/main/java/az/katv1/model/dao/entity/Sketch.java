package az.katv1.model.dao.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Sketch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private int saygac;
    private double coefficient;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime date;

    @ManyToMany
    @JoinTable(
            name = "sketch_equipment",
            joinColumns = @JoinColumn(name = "sketch_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id"))
    private List<Equipment> equipmentList;

    @ManyToMany
    @JoinTable(
            name = "sketch_employee",
            joinColumns = @JoinColumn(name = "sketch_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employeeList;
}
