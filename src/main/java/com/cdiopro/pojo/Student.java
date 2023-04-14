package com.cdiopro.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    private String email;
    private String password;
    private String academy;
    private String major;
    private int askNum;
    private int priority;
}
