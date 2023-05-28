package com.company.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "user_skill", schema = "resumesecond", catalog = "")
public class UserSkill {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "user_id", nullable = true, insertable=false, updatable=false)
    private Integer userId;
    @Basic
    @Column(name = "skill_id", nullable = true, insertable=false, updatable=false)
    private Integer skillId;
    @Basic
    @Column(name = "power", nullable = true)
    private Integer power;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User userByUserId;
    @ManyToOne
    @JoinColumn(name = "skill_id", referencedColumnName = "id")
    private Skill skillBySkillId;

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
        return id == userSkill.id && Objects.equals(userId, userSkill.userId) && Objects.equals(skillId, userSkill.skillId) && Objects.equals(power, userSkill.power);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, skillId, power);
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Skill getSkillBySkillId() {
        return skillBySkillId;
    }

    public void setSkillBySkillId(Skill skillBySkillId) {
        this.skillBySkillId = skillBySkillId;
    }
}
