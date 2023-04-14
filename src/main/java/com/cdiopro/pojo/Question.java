package com.cdiopro.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Question {
    private int id;
    private int StudentId;
    private String description;
    private int priority;
    private int estimateSolveTime;
    private LocalDateTime createTime;
}
