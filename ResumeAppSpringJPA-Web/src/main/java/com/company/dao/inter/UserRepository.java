package com.company.dao.inter;

import com.company.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select u from User u where u.name=:name")
    List<User> findByName(String name);

    @Query(value = "select u from User u where u.name= ?1 and u.surname=?2 and u.email=?3")
    List<User> findByNameAndSurnameAndEmail(String name, String surname, String email);
}
