package az.katv1.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
public class Eskiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String address;
    private int saygac;
    private int coefficient;
    private Date date;
    @ManyToMany
    @JoinTable(
            name = "eskiz_equipment",
            joinColumns = @JoinColumn(name = "eskiz_id"),
            inverseJoinColumns = @JoinColumn(name = "equipment_id"))
    private List<Equipment> equipments;

    @ManyToMany
    @JoinTable(
            name = "eskiz_employee",
            joinColumns = @JoinColumn(name = "eskiz_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private List<Employee> employees;

}
