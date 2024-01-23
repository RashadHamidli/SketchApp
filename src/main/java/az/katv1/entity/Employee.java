package az.katv1.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String surname;
    @ManyToMany(mappedBy = "employees")
    private List<Eskiz> eskizList;
}
