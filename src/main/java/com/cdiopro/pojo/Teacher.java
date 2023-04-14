package com.cdiopro.pojo;

import lombok.Data;

@Data
public class Teacher {
    private int id;
    private String name;
    private String email;
    private String password;
    private int questionNum;
    private int status;
}
