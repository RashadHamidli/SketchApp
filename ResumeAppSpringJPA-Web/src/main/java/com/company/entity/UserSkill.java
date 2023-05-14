package com.company.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_skill", schema = "resumesecond", catalog = "")
public class UserSkill {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "skill_id")
    private Integer skillId;
    @Basic
    @Column(name = "power")
    private Integer power;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSkillId() {
        return skillId;
    }

    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserSkill userSkill = (UserSkill) o;

        if (id != userSkill.id) return false;
        if (userId != null ? !userId.equals(userSkill.userId) : userSkill.userId != null) return false;
        if (skillId != null ? !skillId.equals(userSkill.skillId) : userSkill.skillId != null) return false;
        if (power != null ? !power.equals(userSkill.power) : userSkill.power != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (skillId != null ? skillId.hashCode() : 0);
        result = 31 * result + (power != null ? power.hashCode() : 0);
        return result;
    }
}
