package com.example.mapper;



import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    List<User> ListUser();

    void insertUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    List<User> findByName(String userName);
}
