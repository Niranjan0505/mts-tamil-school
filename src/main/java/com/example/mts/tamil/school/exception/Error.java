package com.example.mts.tamil.school.exception;

import java.io.Serializable;

public class Error implements Serializable {
    private Integer code;
    private String message;
    public Error(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
