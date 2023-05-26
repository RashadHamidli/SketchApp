package com.company.dao.inter;


import com.company.entity.User;

import java.util.Date;
import java.util.List;

public interface UserDAOInter {
    public List<User> getAll(String name, String surname, String email, String phone, String address, Date birthdate);
    public User findByEmail(String email);
    public boolean authenticate(String username, String password);

    public User getById(int id);

    public boolean addUser(User user);

    public boolean updateUser(User user);

    public boolean removeUser(int u);

}
