package com.company.entity;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Objects;

@Entity
public class Country {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "nationality", nullable = true, length = 255)
    private String nationality;
    @OneToMany(mappedBy = "countryByNationalityId")
    private Collection<User> usersById;
    @OneToMany(mappedBy = "countryByBirthplaceId")
    private Collection<User> usersById_0;

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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id == country.id && Objects.equals(name, country.name) && Objects.equals(nationality, country.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nationality);
    }

    public Collection<User> getUsersById() {
        return usersById;
    }

    public void setUsersById(Collection<User> usersById) {
        this.usersById = usersById;
    }

    public Collection<User> getUsersById_0() {
        return usersById_0;
    }

    public void setUsersById_0(Collection<User> usersById_0) {
        this.usersById_0 = usersById_0;
    }
}
