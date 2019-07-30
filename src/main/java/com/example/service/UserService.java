package com.example.service;


import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;


    public List<User> ListUser() {

        return userMapper.ListUser();
    }

    public User insertUser(User user) {
         userMapper.insertUser(user);
         return user;
    }

    public int deleteUser(int id) {
        return userMapper.deleteUser(id);
    }

    public int updateUser(User user) {

        return userMapper.updateUser(user);

    }

    public List<User> findByName(String userName) {
        return userMapper.findByName(userName);
    }
}
