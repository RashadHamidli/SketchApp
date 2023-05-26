package com.company.service.impl;


import com.company.dao.inter.UserDAOInter;
import com.company.entity.User;
import com.company.service.inter.UserServiceinter;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserServiceinter {

    @Autowired
    private UserDAOInter userDao;

    @Override
    public List<User> getAll(String name, String surname, String email, String phone, String address, Date birthdate) {
        return userDao.getAll(name, surname, email, phone, address, birthdate);
    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);
    }

    @Override
    public boolean authenticate(String username, String password) {
        return userDao.authenticate(username, password);
    }

    @Override
    public User getById(int id) {
        return userDao.getById(id);
    }

    @Override
    public boolean updateUser(User u) {
        return userDao.updateUser(u);
    }

    @Override
    public boolean removeUser(int id) {
        return userDao.removeUser(id);
    }

    @Override
    public boolean addUser(User u) {
        return userDao.addUser(u);
    }

}
