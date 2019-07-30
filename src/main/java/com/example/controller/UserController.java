package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/testBoot",method = {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/ListUser")
    @ResponseBody
    public List<User> ListUser(){
        return userService.ListUser();
    }

    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public User insert(User user){
        return userService.insertUser(user);
    }

    @RequestMapping(value = "/deleteUser",method =RequestMethod.GET)
    public String delete(int id){
        int result = userService.deleteUser(id);
        if (result >= 1){
            return "删除成功";
        }else{
            return "删除失败";
        }
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public String update(User user){
        int result = userService.updateUser(user);
        if (result >= 1){
            return "更改成功";
        }else {

            return "更改失败";        }
    }


    @RequestMapping("/ListUserByuserName")
    @ResponseBody
    public List<User> ListUserByuserName(String userName){
        return userService.findByName(userName);

    }
}
