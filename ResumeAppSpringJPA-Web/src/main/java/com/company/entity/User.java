package com.company.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;
    @Basic
    @Column(name = "surname", nullable = false, length = 255)
    private String surname;
    @Basic
    @Column(name = "email", nullable = true, length = 255)
    private String email;
    @Basic
    @Column(name = "phone", nullable = true, length = 255)
    private String phone;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "profile_description", nullable = true, length = 255)
    private String profileDescription;
    @Basic
    @Column(name = "birthdate", nullable = true)
    private Date birthdate;
    @Basic
    @Column(name = "nationality_id", nullable = true, insertable=false, updatable=false)
    private Integer nationalityId;
    @Basic
    @Column(name = "birthplace_id", nullable = true, insertable=false, updatable=false)
    private Integer birthplaceId;
    @Basic
    @Column(name = "password", nullable = false, length = 255)
    private String password;
    @OneToMany(mappedBy = "userByUserId")
    private Collection<EmploymentHistory> employmentHistoriesById;
    @ManyToOne
    @JoinColumn(name = "nationality_id", referencedColumnName = "id")
    private Country countryByNationalityId;
    @ManyToOne
    @JoinColumn(name = "birthplace_id", referencedColumnName = "id")
    private Country countryByBirthplaceId;
    @OneToMany(mappedBy = "userByUserId")
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfileDescription() {
        return profileDescription;
    }

    public void setProfileDescription(String profileDescription) {
        this.profileDescription = profileDescription;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(Integer nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Integer getBirthplaceId() {
        return birthplaceId;
    }

    public void setBirthplaceId(Integer birthplaceId) {
        this.birthplaceId = birthplaceId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email) && Objects.equals(phone, user.phone) && Objects.equals(address, user.address) && Objects.equals(profileDescription, user.profileDescription) && Objects.equals(birthdate, user.birthdate) && Objects.equals(nationalityId, user.nationalityId) && Objects.equals(birthplaceId, user.birthplaceId) && Objects.equals(password, user.password);
    }


    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, email, phone, address, profileDescription, birthdate, nationalityId, birthplaceId, password);
    }

    public Collection<EmploymentHistory> getEmploymentHistoriesById() {
        return employmentHistoriesById;
    }

    public void setEmploymentHistoriesById(Collection<EmploymentHistory> employmentHistoriesById) {
        this.employmentHistoriesById = employmentHistoriesById;
    }

    public Country getCountryByNationalityId() {
        return countryByNationalityId;
    }

    public void setCountryByNationalityId(Country countryByNationalityId) {
        this.countryByNationalityId = countryByNationalityId;
    }

    public Country getCountryByBirthplaceId() {
        return countryByBirthplaceId;
    }

    public void setCountryByBirthplaceId(Country countryByBirthplaceId) {
        this.countryByBirthplaceId = countryByBirthplaceId;
    }

    public Collection<UserSkill> getUserSkillsById() {
        return userSkillsById;
    }

    public void setUserSkillsById(Collection<UserSkill> userSkillsById) {
        this.userSkillsById = userSkillsById;
    }
}
