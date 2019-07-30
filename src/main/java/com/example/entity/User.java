package com.example.entity;


import lombok.Data;
/**
 * @Auther:wp
 * @Date:7.29
 */

@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String realName;
}
