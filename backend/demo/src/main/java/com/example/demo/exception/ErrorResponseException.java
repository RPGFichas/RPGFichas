package com.example.demo.exception;

import java.time.LocalDateTime;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ErrorResponseException {
    private LocalDateTime dateTime;
    private int errorCode;
    private String error;
    private String method;
    private String requestURI;
    private Map<String, String> map;
    private String message;
}
