package com.company.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Skill {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false)
    private String name;
    @OneToMany(mappedBy = "skillBySkillId")
    private Collection<UserSkill> userSkillsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Skill skill = (Skill) o;
        return id == skill.id && name == skill.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Collection<UserSkill> getUserSkillsById() {
        return userSkillsById;
    }

    public void setUserSkillsById(Collection<UserSkill> userSkillsById) {
        this.userSkillsById = userSkillsById;
    }
}
