package com.cdiopro.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Answer {
    private int id;
    private int questionId;
    private int teacherId;
    private String content;
    private LocalDateTime answerTime;
}
