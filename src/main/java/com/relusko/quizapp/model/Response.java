package com.relusko.quizapp.model;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Response {

    private Integer id;
    private String response;
}
