package az.katv1.entity;

import jakarta.persistence.*;
import lombok.Data;

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
    private java.util.Date date;

    @ManyToMany
    @JoinTable(
            name = "sketch_equipment",
            joinColumns = @JoinColumn(name = "sketch_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id"))
    private List<Equipment> equipments;

    @ManyToMany
    @JoinTable(
            name = "sketch_employee",
            joinColumns = @JoinColumn(name = "sketch_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employees;
}
